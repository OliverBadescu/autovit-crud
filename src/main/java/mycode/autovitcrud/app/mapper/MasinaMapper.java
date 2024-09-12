package mycode.autovitcrud.app.mapper;

import mycode.autovitcrud.app.dto.CreateCarResponse;
import mycode.autovitcrud.app.model.Masina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MasinaMapper {
    MasinaMapper INSTANCE = Mappers.getMapper(MasinaMapper.class);


    Masina toMasina(CreateCarResponse dto);

    CreateCarResponse toDto(Masina masina);

}
