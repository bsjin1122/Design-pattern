package factory_pattern;

// 팩토리 패턴 도입하기
public class Main {
    public static void main(String[] args) {
        // 싱글톤 제작
        DBFactory dbFactory = DBFactory.getInstance();
        // 내가 MariaDB 객체를 알 필요가 없음
        // setUrl부터 해야 할지, execute부터 해야할지 생각할 필요가 없음
        // 문자열만 추가해서 DB를 생성하면 돼요. (내가 의존해야 할 것은 DBFactory)
        DB maria = dbFactory.createDB("maria");
        maria.execute("select");

        DB mysql = dbFactory.createDB("mysql");
        mysql.execute("select");

    }
}
