package sakila.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryUpdatedDto extends InventoryDto {

    private String updateFilm;
    private int updateStoreId;

}
