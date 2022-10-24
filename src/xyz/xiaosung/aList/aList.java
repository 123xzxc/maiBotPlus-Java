package xyz.xiaosung.aList;

/** 机厅信息
 * @author 柊韵*/
public class aList {
    /** 别名 */
    String nickName;
    /** 机厅名称 */
    String name;
    /** 机厅地址 */
    String address;
    /** 开店时间 */
    Integer openDate;
    /** 闭店时间 */
    Integer closeDate;
    /** 机台数量 */
    Integer quantity;

    public aList(String nickName, String name, String address, Integer openDate, Integer closeDate, Integer quantity) {
        this.nickName = nickName;
        this.name = name;
        this.address = address;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.quantity = quantity;
    }

    public aList() {
    }

    @Override
    public String toString() {
        return "aList{" +
                "nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openDate=" + openDate +
                ", closeDate=" + closeDate +
                ", quantity=" + quantity +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Integer openDate) {
        this.openDate = openDate;
    }

    public Integer getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Integer closeDate) {
        this.closeDate = closeDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
