package xyz.xiaosung.number;

/**
 * @author 柊韵
 */
public interface aNumberInterface {
    /** 增加人数
     * @param nickName 机厅别名
     * @param value 增加数量
     * @param updateName 更新人名称
     * @return 返回一个 aNumber 即为该机厅的人员信息
     */
    aNumber addNumber(String nickName,Integer value,String updateName);
    /** 减少人数
     * @param nickName 机厅别名
     * @param value 减少数量
     * @param updateName 更新人名称
     * @return 返回一个 aNumber 即为该机厅的人员信息
     */
    aNumber delNumber(String nickName,Integer value,String updateName);
    /** 直接修改人数
     * @param nickName 机厅别名
     * @param value 修改数量
     * @param updateName 更新人名称
     * @return 返回一个 aNumber 即为该机厅的人员信息
     */
    aNumber editNumber(String nickName,Integer value,String updateName);
    /** 清空人数
     * @param nickName 机厅别名
     * @param updateName 更新人名称
     * @return 返回一个 aNumber 即为该机厅的人员信息
     */
    aNumber clear(String nickName,String updateName);
    /** 查询人数
     * @param nickName 机厅别名
     * @return 返回一个 aNumber 即为该机厅的人员信息
     */
    aNumber readNumberByNickName(String nickName);
}
