fun main() {
    println("Valor padrão da diaria?");
    val day = readln().toInt();
    println("Quantas diarias são necessarias?");
    val qntDay = readln().toInt();
    println("O valor de $day dias de hospedagem é de ${day * qntDay}");
    var name = "";
    if (day < 0 || qntDay < 0 || qntDay > 30) {
        println("Informações invalidas");
    } else {
        println("Nome do hospede?");
        name = readln();
    };

    val quartos =
        "1-livre; 2-livre; 3-livre; 4-livre; 5-ocupado; 6-livre; 7-ocupado; 8-livre; 9-livre; 10-livre; 11-livre; 12-livre; 13-livre; 14-livre; 15-livre; 16-livre; 17-livre; 18-livre; 19-livre; 20-ocupado"
    val rooms = quartos.split(" ").toTypedArray();
    var room: String;
    var res: String;
    var rep = true;

    rooms.forEach {
        println(it);
    };
    println("======//======");
    while (rep) {
        println("Selecione o quarto (1-20)");
        room = readln() + "-livre;";
        if (rooms.contains(room)) {
            res = ("Livre");
            println(res);
            rep = false;
        } else {
            res = ("Ocupado, escolha um quarto vago");
            println(res);
            println("======//======");
        }
        println("Ibura, reserva efetuada para $name");
    }
}