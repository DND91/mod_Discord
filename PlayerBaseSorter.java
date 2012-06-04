package net.minecraft.src;

import java.util.*;

public final class PlayerBaseSorter implements Comparator
{
    private Map explicitInferiors;
    private Map explicitSuperiors;
    private Map directInferiorsMap;
    private Map allInferiors;
    private Map groupIndexes;
    private Map indexes;
    private final List list;
    private final Map allBaseSuperiors;
    private final Map allBaseInferiors;
    private final String methodName;
    private static final Set Empty = new HashSet();

    public PlayerBaseSorter(List list1, Map map, Map map1, String s)
    {
        list = list1;
        allBaseSuperiors = map;
        allBaseInferiors = map1;
        methodName = s;
    }

    public void Sort()
    {
        if (list.size() <= 1)
        {
            return;
        }

        if (explicitInferiors != null)
        {
            explicitInferiors.clear();
        }

        if (explicitSuperiors != null)
        {
            explicitSuperiors.clear();
        }

        if (directInferiorsMap != null)
        {
            directInferiorsMap.clear();
        }

        if (allInferiors != null)
        {
            allInferiors.clear();
        }

        if (groupIndexes != null)
        {
            groupIndexes.clear();
        }

        if (indexes != null)
        {
            indexes.clear();
        }

        for (int i = 0; i < list.size(); i++)
        {
            String s = (String)list.get(i);
            String as[] = (String[])allBaseInferiors.get(s);
            boolean flag = as != null && as.length > 0;
            String as1[] = (String[])allBaseSuperiors.get(s);
            boolean flag1 = as1 != null && as1.length > 0;

            if ((flag || flag1) && directInferiorsMap == null)
            {
                directInferiorsMap = new Hashtable();
            }

            if (flag)
            {
                explicitInferiors = build(s, explicitInferiors, directInferiorsMap, null, as);
            }

            if (flag1)
            {
                explicitSuperiors = build(s, explicitSuperiors, null, directInferiorsMap, as1);
            }

            if (groupIndexes == null)
            {
                groupIndexes = new Hashtable();
            }

            groupIndexes.put(s, Integer.valueOf(i));

            if (indexes == null)
            {
                indexes = new Hashtable();
            }

            indexes.put(s, Integer.valueOf(i));
        }

        if (directInferiorsMap != null)
        {
            for (int j = 0; j < list.size() - 1; j++)
            {
                for (int i1 = j + 1; i1 < list.size(); i1++)
                {
                    String s1 = (String)list.get(j);
                    String s2 = (String)list.get(i1);
                    Set set = null;
                    Set set1 = null;

                    if (explicitInferiors != null)
                    {
                        set = (Set)explicitInferiors.get(s1);
                        set1 = (Set)explicitInferiors.get(s2);
                    }

                    Set set2 = null;
                    Set set3 = null;

                    if (explicitSuperiors != null)
                    {
                        set2 = (Set)explicitSuperiors.get(s1);
                        set3 = (Set)explicitSuperiors.get(s2);
                    }

                    boolean flag2 = set2 != null && set2.contains(s2);
                    boolean flag3 = set != null && set.contains(s2);
                    boolean flag4 = set3 != null && set3.contains(s1);
                    boolean flag5 = set1 != null && set1.contains(s1);

                    if (flag2 && flag4)
                    {
                        throw new UnsupportedOperationException((new StringBuilder()).append("Can not sort PlayerBase classes for method '").append(methodName).append("'. '").append(s1).append("' wants to be inferior to '").append(s2).append("' and '").append(s2).append("' wants to be inferior to '").append(s1).append("'").toString());
                    }

                    if (flag3 && flag5)
                    {
                        throw new UnsupportedOperationException((new StringBuilder()).append("Can not sort PlayerBase classes for method '").append(methodName).append("'. '").append(s1).append("' wants to be superior to '").append(s2).append("' and '").append(s2).append("' wants to be superior to '").append(s1).append("'").toString());
                    }

                    if (flag2 && flag3)
                    {
                        throw new UnsupportedOperationException((new StringBuilder()).append("Can not sort PlayerBase classes for method '").append(methodName).append("'. '").append(s1).append("' wants to be superior and inferior to '").append(s2).append("'").toString());
                    }

                    if (flag4 && flag5)
                    {
                        throw new UnsupportedOperationException((new StringBuilder()).append("Can not sort PlayerBase classes for method '").append(methodName).append("'. '").append(s2).append("' wants to be superior and inferior to '").append(s1).append("'").toString());
                    }
                }
            }

            if (allInferiors == null)
            {
                allInferiors = new Hashtable();
            }

            for (int k = 0; k < list.size(); k++)
            {
                build((String)list.get(k), null);
            }

            for (int l = 0; l < list.size(); l++)
            {
                indexes((String)list.get(l));
            }
        }

        Collections.sort(list, this);
    }

    private void indexes(String s)
    {
        int i = ((Integer)groupIndexes.get(s)).intValue();
        Iterator iterator = ((Set)allInferiors.get(s)).iterator();

        do
        {
            if (!iterator.hasNext())
            {
                break;
            }

            String s1 = (String)iterator.next();

            if (i > ((Integer)groupIndexes.get(s1)).intValue())
            {
                groupIndexes.put(s1, Integer.valueOf(i));
            }
        }
        while (true);
    }

    private Set build(String s, String s1)
    {
        Set set = (Set)allInferiors.get(s);

        if (set == null)
        {
            set = build(s, null, s1 == null ? s : s1);

            if (set == null)
            {
                set = Empty;
            }

            allInferiors.put(s, set);
        }

        return set;
    }

    private Set build(String s, Set set, String s1)
    {
        Set set1 = (Set)directInferiorsMap.get(s);

        if (set1 == null)
        {
            return set;
        }

        if (set == null)
        {
            set = new HashSet();
        }

        Iterator iterator = set1.iterator();

        do
        {
            if (!iterator.hasNext())
            {
                break;
            }

            String s2 = (String)iterator.next();

            if (s2 == s1)
            {
                throw new UnsupportedOperationException((new StringBuilder()).append("Can not sort PlayerBase classes for method '").append(methodName).append("'. Circular superiosity found including '").append(s1).append("'").toString());
            }

            set.add(s2);
            Set set2;

            try
            {
                set2 = build(s2, s1);
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                throw new UnsupportedOperationException((new StringBuilder()).append("Can not sort PlayerBase classes for method '").append(methodName).append("'. Circular superiosity found including '").append(s2).append("'").toString(), unsupportedoperationexception);
            }

            if (set2 != Empty)
            {
                set.addAll(set2);
            }
        }
        while (true);

        return set;
    }

    private static Map build(String s, Map map, Map map1, Map map2, String as[])
    {
        if (map == null)
        {
            map = new Hashtable();
        }

        HashSet hashset = new HashSet();

        for (int i = 0; i < as.length; i++)
        {
            if (as[i] != null)
            {
                hashset.add(as[i]);
            }
        }

        if (map1 != null)
        {
            getOrCreateSet(map1, s).addAll(hashset);
        }

        if (map2 != null)
        {
            for (Iterator iterator = hashset.iterator(); iterator.hasNext(); getOrCreateSet(map2, (String)iterator.next()).add(s)) { }
        }

        map.put(s, hashset);
        return map;
    }

    private static Set getOrCreateSet(Map map, String s)
    {
        Object obj = (Set)map.get(s);

        if (obj == null)
        {
            map.put(s, obj = new HashSet());
        }

        return ((Set)(obj));
    }

    public int compare(String s, String s1)
    {
        if (allInferiors != null)
        {
            if (((Set)allInferiors.get(s)).contains(s1))
            {
                return 1;
            }

            if (((Set)allInferiors.get(s1)).contains(s))
            {
                return -1;
            }
        }

        int i = ((Integer)groupIndexes.get(s)).compareTo((Integer)groupIndexes.get(s1));

        if (i != 0)
        {
            return i;
        }
        else
        {
            return ((Integer)indexes.get(s)).compareTo((Integer)indexes.get(s1));
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }
}
