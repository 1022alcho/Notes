import java.util.*;

class SubdomainVisits {
    public static void main(String[] args) { 
        String[] test = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> afterRun = subdomainVisits(test);
        for(String x : afterRun) { 
            System.out.println(x);
        }
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String x : cpdomains) {
            String[] s1 = x.split(" ");
            int visit = Integer.parseInt(s1[0]);
            String[] splitSub = s1[1].split("\\.");
            String add = "";
            for(int i = splitSub.length - 1; i >= 0; i--) { 
                add = splitSub[i] + (i < splitSub.length - 1 ? "." : "") + add;
                // if(map.containsKey(add)) { 
                //     map.put(add, map.get(add) + visit);
                // } else { 
                //     map.put(add, visit);
                // }
                map.put(add, map.getOrDefault(add, 0) + visit);
            }
        }
        List<String> list = new ArrayList<String>();
        for(String key : map.keySet()) { 
            list.add(map.get(key) + " " + key);
        }
        return list;
    }
}
