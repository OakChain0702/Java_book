import java.time.*;

public class Moment{
  public static void main(String[] args){
    // Instantの生成
    //現在日時を取得
    Instant i1 = Instant.now();
    // Instantとlong値との相互変換
    Instant i2 = Instant.ofEpochMilli(1600705425827L);
    long l = i2.toEpochMilli();

    // ZonedDateTimeの生成
    //現在日時を取得
    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

    // InstantとZonedDateTimeの相互変換
    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    // ZoneDateTimeの利用方法
    System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
    System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
    if(z2.isEqual(z3)){
      System.out.println("これらは同じ瞬間を指しています");
    }
  }
}