package xyz.xiaosung.jtPlus;

/**
 * @author 柊韵
 */
public interface aListInterface {
    /** 使用机厅信息添加机厅
     * @param nickName 机厅别名
     * @param name 机厅名称
     * @param address 机厅地址
     * @param openDate 开店时间
     * @param closeDate 闭店时间
     * @param quantity 机台数量
     * @return 可以为Boolean 是否添加成功
    */
    Object add(String nickName, String name, String address, Integer openDate, Integer closeDate, Integer quantity);

    /** 使用别名删除机厅
     * @param nickName 机厅别名
     * @return 可以为Boolean 是否添加成功
     */
    Object delByNickName(String nickName);
    /** 使用名称删除机厅
     * @param name 机厅名称
     * @return 可以为Boolean 是否添加成功
     */
    Object delByName(String name);

    /** 使用别名读取机厅
     * @param nickName 机厅别名
     * @return 返回一个 aList 即机厅信息
     * */
    aList readByNickName(String nickName);
    /** 使用名称读取机厅
     * @param name 机厅别名
     * @return 返回一个 aList 即机厅信息
     */
    aList readByName(String name);
}
