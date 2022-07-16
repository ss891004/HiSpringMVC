package s11;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class UserDto {
    //姓名
    private String name;
    //头像
    private MultipartFile headImg;
    //多张证件照
    private List<MultipartFile> idImgList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getHeadImg() {
        return headImg;
    }

    public void setHeadImg(MultipartFile headImg) {
        this.headImg = headImg;
    }

    public List<MultipartFile> getIdImgList() {
        return idImgList;
    }

    public void setIdImgList(List<MultipartFile> idImgList) {
        this.idImgList = idImgList;
    }
}

