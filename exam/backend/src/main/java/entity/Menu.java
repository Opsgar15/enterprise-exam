package entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Gard on 07.06.2017.
 */
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotNull
    private LocalDate date;

    @OneToMany(mappedBy = "menu")
    @NotEmpty
    private List<Dish> dishes;

    public Menu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
