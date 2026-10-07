package ex2;

public class Vers {
    private String text;

    public Vers(String text){
        this.text = text;
    }

    public int nrCuv(){
        String t = text.trim();
        if(t.isEmpty()) return 0;
        return t.split("\\s+").length;
    }

    public int nrVoc(){
        String vocale = "aeiouăâîAEIOUĂÂÎ";
        int nr = 0;
        for(int i = 0; i < text.length(); i++){
            if(vocale.indexOf(text.charAt(i)) >= 0){
                nr++;
            }
        }
        return nr;
    }

    public boolean seTerm(String grup){
        String t = text.trim().replaceAll("[^\\p{L}]+$", "").toLowerCase();
        return t.endsWith(grup.toLowerCase());
    }

    public String Maj(){
        return text.toUpperCase();
    }

    public String getText(){
        return text;
    }
}
