package com.campusdual.appmazing.model.dto.dtomapper;

import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper // poner siempre esta notacion
public interface ProductMapper { //como cambiar de un productDto a product y viceversa
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class); // crea un elemento instance
    ProductDTO toDTO(Product product); // pasa un prodcuto a un productDto
    List<ProductDTO> toDTOList(List<Product> products); // Lista de productos y nos devuelve una lista de productDto (no existe al reves)

    Product toEntity(ProductDTO productDTO); // pasa un prodcutDtop a un producto
}
