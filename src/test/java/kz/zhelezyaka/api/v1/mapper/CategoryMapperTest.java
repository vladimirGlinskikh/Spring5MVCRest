package kz.zhelezyaka.api.v1.mapper;

import kz.zhelezyaka.api.v1.model.CategoryDTO;
import kz.zhelezyaka.domain.Category;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryMapperTest {
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() {
        Category category = new Category();
        category.setName("Vladimir");
        category.setId(1L);

        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        assertEquals(Long.valueOf(1L), categoryDTO.getId());
        assertEquals("Vladimir", categoryDTO.getName());
    }
}