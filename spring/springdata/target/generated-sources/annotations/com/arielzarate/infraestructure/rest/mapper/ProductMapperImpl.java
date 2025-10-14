package com.arielzarate.infraestructure.rest.mapper;

import com.arielzarate.domain.model.Product;
import com.arielzarate.infraestructure.rest.dto.ProductDTO;
import com.arielzarate.infraestructure.rest.dto.ProductRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-14T18:10:30-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO mapToDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setProductId( product.getProductId() );
        productDTO.setName( product.getName() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setStock( product.getStock() );

        return productDTO;
    }

    @Override
    public List<ProductDTO> mapToDTOList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( products.size() );
        for ( Product product : products ) {
            list.add( mapToDTO( product ) );
        }

        return list;
    }

    @Override
    public Product mapToDomain(ProductRequest productRequest) {
        if ( productRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productRequest.getProductId() );
        product.setName( productRequest.getName() );
        product.setDescription( productRequest.getDescription() );
        product.setPrice( productRequest.getPrice() );
        product.setStock( productRequest.getStock() );

        return product;
    }
}
