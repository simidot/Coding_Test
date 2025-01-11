class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] polySplit = polynomial.split(" ");
        int poly = 0;
        int number = 0;
        for (int i=0; i<polySplit.length; i+=2) {
            if (polySplit[i].contains("x")) {
                String sub = polySplit[i].substring(0, polySplit[i].length() - 1);
                if (sub.isEmpty()) {
                    poly+=1;
                } else {
                    poly += Integer.parseInt(sub);
                }
            } else {
                number += Integer.parseInt(polySplit[i]);
            }
        }

        answer = (poly != 0 ? poly > 1 ? poly+ "x" : "x" : "") 
            + (number != 0 ? poly != 0 ? " + " : "" : "")
            + (number != 0 ? number : "");
        
        return answer;
    }
}