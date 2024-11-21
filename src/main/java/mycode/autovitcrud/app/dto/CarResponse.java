package mycode.autovitcrud.app.dto;

public record CarResponse(int id, String marca, String model, int km, boolean uzata, double pret, int an) {
}
