package kz.zhelezyaka.api.v1.mapper;

import kz.zhelezyaka.api.v1.model.CategoryDTO;
import kz.zhelezyaka.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);
}
