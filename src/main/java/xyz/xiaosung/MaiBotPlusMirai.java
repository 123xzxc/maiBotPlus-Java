package xyz.xiaosung;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import xyz.xiaosung.jtPlus.ali.aList;
import xyz.xiaosung.jtPlus.ali.impl.AllList;

public final class MaiBotPlusMirai extends JavaPlugin {
    public static final MaiBotPlusMirai INSTANCE = new MaiBotPlusMirai();

    private MaiBotPlusMirai() {
        super(new JvmPluginDescriptionBuilder("xyz.xiaosung.maiBotPlus", "0.1.0")
                .name("maiBotPlusMirai")
                .author("Yun Zhong")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("MaiBotPlus 已加载!");
        AllList alllist = AllList.getAllList();
        //String nickName, String name, String address, Date openDate, Date closeDate, Integer quantity
        alllist.add("ss","三盛","三盛国际广场",10,22,1);

        GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class, g -> {
            //获取字符串末尾（几爷）
            if(g.getMessage().contentToString().length() > 3) {
                if ("在哪里".equals(g.getMessage().contentToString().substring(g.getMessage().contentToString().length() - 3))) {
                    //获取机厅别名
                    String jt = g.getMessage().contentToString().substring(0, g.getMessage().contentToString().length() - 3);
                    aList alist = alllist.readByNickName(jt);
                    if (alist != null) {
                        g.getSubject().sendMessage("您查询的机厅为: " + alist.getName() +
                                "\n地址为: " + alist.getAddress() +
                                "\n开店时间: " + alist.getOpenDate() +
                                "\n闭店时间: " + alist.getCloseDate() +
                                "\n机台数量: " + alist.getQuantity());
                    }
                }
            }
            //几爷
            if(g.getMessage().contentToString().length() > 2) {
                if ("几爷".equals(g.getMessage().contentToString().substring(g.getMessage().contentToString().length() - 2))) {
                    //获取机厅别名
                    String jt = g.getMessage().contentToString().substring(0, g.getMessage().contentToString().length() - 2);
                    aList alist = alllist.readByNickName(jt);
                    if (alist != null) {
                        g.getSubject().sendMessage(alist.getName() + "目前有:" + "[number]" + "人\n" +
                                "平均每台:" + "[avgNumber]" + "人\n" +
                                "最后更新时间为:" + "[timestamp(需计算)]\n" +
                                "更新人为:" + "[updateName]\n" +
                                "目前状态:" + "[开店/闭店(根据时间)]\n" +
                                "人太多啦，去其他地方吧/现在这里还没有人哦，快来玩(根据平均人数)\n" +
                                "没做完 这些都是占位符w");
                    }
                }
            }
        });

        GlobalEventChannel.INSTANCE.subscribeAlways(FriendMessageEvent.class, f -> {
            //监听好友消息
            getLogger().info(f.getMessage().contentToString());
        });

    }
}