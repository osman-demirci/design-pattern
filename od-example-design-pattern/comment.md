```
"io.od.example.designpattern.chess.behavior" paketinde yer alan sınıflar strategy design pattern yapısına benzer olarak oluşturulmuştur. 
Bu paketlerde yer tüm sınıflar state tutmazlar ve tekrar kullanılabilir oldukları için singleton olarak tasarlanmışlardır.

Satranç taşlarının hareket kuralları aşağıdaki method içinde değerlendirilir.

@Override
public void toMove(ChessGameEventInvoker invoker, MovementEvent event) {

}


Genel olara sınıflar SOLID kurallarına uygun olarak oluşturulmuştur. 
Örneğin taşların hareketlerinin değerlendirilmesi ChessPiece.class yerine behavior sınıfı içinde yapılması tek sorumluk ilkesini sağlamak içindir.
Yine PromotedChessPiece nesnesi open/closed prensibini sağlamaktır.


Taş haretlerinin değerlendirilmesi için event'lerden faydalanılmıştır. 
ChessGameHandlerContext ve ilişkili sınıfların tasarımda chain of responsibilities design pattern ilkeleri gözetilmiştir.


```