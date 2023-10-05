package composition;

public class RAM {
    int sizeGB;

    public RAM(int sizeGB){
        this.sizeGB = sizeGB;
    }

    public void load(){
        System.out.println(sizeGB + "GB RAM이 데이터를 로드합니다.");
    }
}
