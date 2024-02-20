// abstract classe ei saa luua
// ei saa teha: new Tegelane();
public abstract class Tegelane {
    // kehtivad kõikidele tegelastele
    int xCoord; // deklareerin (loob + mälukoht)
    int yCoord; // parem klõps -> refactor -> rename ja muudab kõikjal
    char symbol;
}
