package com.remindme.dto;


//data transfer object
public class RemindDTO {
    private String id;
    private String title;
    private String remindDate;

    //для правильной конвертации из json в java обьекты обязательно должен быть пустой конструктор


    public RemindDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(String remindDate) {
        this.remindDate = remindDate;
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
