package mycode.autovitcrud.app.dto;

public record UpdateCarRequest(String marca, String model, int km, boolean uzata, double pret, int an) {
}
