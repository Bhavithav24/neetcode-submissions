class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c : t.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int a[] = new int[s.length()];
        int m = 0;
        for(int x = 0; x < s.length(); x++){
            if(map1.containsKey(s.charAt(x))) a[m++] = x;   
        }
        String res = "";
        for(int r = 0; r < s.length(); r++){
            int l = 0, n = 0;
            while(n < m && a[n] <= r){
                map2 = new HashMap<>();
                l = a[n];
                int i = n;
                while(i < m && a[i] <= r){
                    char c = s.charAt(a[i]);
                    map2.put(c, map2.getOrDefault(c, 0) + 1);
                    i++;
                }
                boolean bol = true;
                for(char c : t.toCharArray()){
                    if(!map2.containsKey(c) || map2.get(c) < map1.get(c)){
                        bol = false;
                        break;
                    }
                }
                if(bol){
                    if(res.equals("") || r - l + 1 < res.length()){
                        res = s.substring(l, r + 1); 
                    }
                }
                n++;
            }
        }

        return res;


        /*
        int[] b = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                b[x++] = i;
            }
        }

        int l = 0;
        int n = 0;
        String res = "";

        String[] str = new String[s.length() - t.length() + 1];

        for (int r = t.length() - 1; r < x; r++) {

            for (l = 0; l <= r - t.length() + 1; l++) {
                str[n++] = s.substring(b[l], b[r] + 1);
            }
        }

        for (int z = 0; z < n; z++) {
            String c = str[z];

            if (c.length() < res.length() || res.equals("")) {

                HashMap<Character, Integer> map2 = new HashMap<>();

                for (char car : c.toCharArray()) {
                    if (map.containsKey(car)) {
                        map2.put(car, map2.getOrDefault(car, 0) + 1);
                    }
                }

                boolean bol = true;

                for (char car : t.toCharArray()) {
                    if (map.getOrDefault(car, 0)
                            > map2.getOrDefault(car, 0)) {
                        bol = false;
                        break;
                    }
                }

                if (bol) {
                    res = c;
                }
            }
        }

        return res;
        */
    }
}