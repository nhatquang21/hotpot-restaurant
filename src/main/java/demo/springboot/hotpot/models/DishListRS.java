package demo.springboot.hotpot.models;


import java.io.Serializable;
import java.util.Date;

public class DishListRS implements Serializable {
    private Long id;
    private String name;
    private String slug;
    private String note;
    private Date createdAt;
    private Date updatedAt;
    private Long createdBy;
    private Long updatedBy;
}
