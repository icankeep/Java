/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.14-log : Database - disable
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`disable` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `disable`;

/*Table structure for table `admins` */

DROP TABLE IF EXISTS `admins`;

CREATE TABLE `admins` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `admins` */

insert  into `admins`(`aid`,`username`,`password`) values 
(1,'xxl','123');

/*Table structure for table `commends` */

DROP TABLE IF EXISTS `commends`;

CREATE TABLE `commends` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `comname` varchar(255) DEFAULT NULL,
  `comcontent` text,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `commends` */

insert  into `commends`(`cid`,`comname`,`comcontent`) values 
(5,'重磅微视频《“一带一路”5岁了，真好！》','2013年10月3日，中国国家主席习近平在印度尼西亚国会发表演讲，首次向世界发出共建“21世纪海上丝绸之路”的倡议。此前，2013年9月7日，习近平主席在哈萨克斯坦纳扎尔巴耶夫大学发表演讲，首次提出共建“丝绸之路经济带”。\r\n习主席在推进“一带一路”建设工作5周年座谈会上发表重要讲话强调，五年来，共建“一带一路”正在成为我国参与全球开放合作、改善全球经济治理体系、促进全球共同发展繁荣、推动构建人类命运共同体的中国方案。'),
(6,'中国亚残运代表团30日启程赴雅加达','参加第三届亚洲残疾人运动会的中国代表团29日在北京举行出征动员大会，代表团大部分成员于30日启程奔赴印度尼西亚。10月6日－13日，第三届亚残运会将在雅加达举行，将有来自43个国家和地区的约3000名运动员参赛。\r\n本届亚残运设视力、肢体、智力三个残疾类别共18个竞赛大项，中国代表团将参加视力和肢体两个类别的15个大项的比赛。本次中国队派出运动员232人，是中国队境外参加远南运动会和亚残运会运动员人数最多的一届。整个代表团总计377人，由中国残联主席、中国残奥委员会主席张海迪担任团长。运动员平均年龄24.9岁，年龄最小的是13岁的广东籍乒乓球运动员黄文娟。\r\n中国残联党委书记、理事长、北京冬奥组委副主席周长奎在会上说，党中央、国务院对残疾人体育事业非常关心和支持，希望代表团继续发扬自强不息、奋勇争先的残疾人体育精神，在亚残运会赛场上赛出中国人的精气神。中国奥委会副主席李玲蔚代表国家体育总局和中国奥委会也到现场为代表团壮行。'),
(7,'天津启动盲人智能听书机免费借阅服务','为推进盲人数字阅读推广工程，２８日，天津智能听书机免费借阅服务工作在天津图书馆正式启动。一部具有上网功能的听书机，可以轻松打开盲人朋友的阅读大门。\r\n记者了解到，为创新视障读者阅读推广服务模式，中宣部等五部委联合发布了《盲人数字阅读推广工程项目实施方案》。为深入贯彻落实文件精神，天津市启动盲人数字阅读推广工程“智能听书机”项目。'),
(8,'谷歌推出Lookout 演示更加实用的AI语音导盲应用','从本届 I/O 开发者大会来看，谷歌显然希望将AI技术运用到尽可能多的领域。不过除了造福普通用户，该公司还希望为残障人士提供帮助，比如一款名叫Lookout的Android语音导盲应用。 通过与Pixel智能机的“软硬结合”，视障人士可以将手机套在脖子上、或者置于上衣口袋，然后将后置摄像头对准前方。\r\n软件可以识别打印文本、引导标识、人与物(比如座椅板凳)，用户可以敲击三下，然后Lookout就会告知东西所处的方位(比如‘三点钟方向有沙发’)。\r\n这款应用的功能，听起来和微软去年晚些时候向iOS平台推出的Seeing AI差不多，都是支持“语音式摄像头”功能(指啥说啥)。但相比之下，Google Android + Pixel组合而成的Lookout应用，显然更实用一些。'),
(9,'音乐平台酷狗无障碍适配专为视障用户','活动首先设计了盲人运用现有的导航手机软件进行导航的步行比赛。并在志愿者的安全保护下由地铁APM线的妇幼中心站前往广州图书馆。华途科技的“听听出行”盲人专用导航仪不用输入任何文字，只要告诉导航仪目的地，导航仪就会帮助盲人或步行、或乘车导航，非常人性化。\r\n随着科技的飞速发展，互联网技术不仅可以帮助盲人朋友解决出行等基础生活难题，也可以帮助他们无障碍的享受娱乐生活。为让盲人视障用户能与普通用户一样听歌无障碍，酷狗音乐推出无障碍适配功能。视障用户通过适配系统自带的读屏软件，酷狗界面上的内容即可语音播报出来，在看不见的情况下也能顺畅地听歌，解决了广大盲人视障用户的痛点。'),
(10,'日本规定航空公司于10月起须为坐轮椅乘客提供必要升降设备','为使坐轮椅的乘客能顺利登机，日本国土交通省规定，各航空公司从10月1起须为轮椅乘客提供必要的升降设备。\r\n据日本NHK电视台9月29日报道，日本实施上述新规与去年一名轮椅乘客在鹿儿岛奄美机场登机时被迫爬上阶梯式舷梯有关。2017年6月，日本廉价航空香草航空以有掉落危险为由，拒绝一名轮椅乘客在同伴帮助下被抬上飞机，导致该乘客最终靠双手爬行登上飞机。123');

/*Table structure for table `keywords` */

DROP TABLE IF EXISTS `keywords`;

CREATE TABLE `keywords` (
  `kid` int(11) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`kid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `keywords` */

insert  into `keywords`(`kid`,`keyword`) values 
(1,'你好'),
(3,'政策'),
(8,'音乐'),
(9,'处方');

/*Table structure for table `pictures` */

DROP TABLE IF EXISTS `pictures`;

CREATE TABLE `pictures` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `picname` varchar(255) DEFAULT NULL,
  `picaddress` text,
  `flag` int(11) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `pictures` */

insert  into `pictures`(`pid`,`picname`,`picaddress`,`flag`) values 
(1,'残疾人相亲','images/a1.png',0),
(2,'解决残疾人最后“一公里”问题','images/a2.png',0),
(3,'海南省残疾人毕业生招聘会','images/a3.png',0),
(4,'20家企业真情相助120名残疾人','images/a4.png',0),
(24,'运动使我快乐','images/123.jpg',0),
(25,'背景图片','images/slider1.png',1);

/*Table structure for table `policys` */

DROP TABLE IF EXISTS `policys`;

CREATE TABLE `policys` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `polname` varchar(255) DEFAULT NULL,
  `polcontent` text,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `policys` */

insert  into `policys`(`pid`,`polname`,`polcontent`) values 
(6,'甘肃今年将扶持80个残疾人就业扶贫基地','每个基地将获补贴10万元，有条件的市州或县区残联，可根据基地规模及安置残疾人数量等情况安排配套资金，适当提高资金补助标准。获补资金的50%以资金配股的方式明确到被扶持建档立卡贫困残疾人名下，并优先向无劳动能力的建档立卡贫困残疾人配股，在年底进行保息分红。\r\n此外，对有劳动能力的建档立卡贫困残疾人，可安排在本基地就业，被安置残疾人中途退出时要及时替换安置其它残疾人就业，带动贫困残疾人家庭增收脱贫。'),
(7,'欧莱雅、京东和中国残疾人福利基金会联手，助残疾人士就业、培训','近日，中国残疾人福利基金会、欧莱雅集团和京东集团在位于江苏省宿迁市的京东客户服务中心公布了“包容美力计划”一周年运营进展及帮扶结果，同时宣布新的一年，“计划”除了在就业与培训领域继续努力，还将全面升级，筹建江苏地区最大的企业自建残疾员工无障碍康体活动中心。中国残疾人联合会副主席、中国残疾人福利基金会理事长王乃坤女士、欧莱雅中国首席执行官斯铂涵先生、京东公益基金会理事、京东集团副总裁龙宝正先生等三方管理团队代表出席了一周年回顾活动暨无障碍康体活动中心项目启动仪式。'),
(8,'河南鲁山县：肢残志坚颜满仓 种植果树增收忙','9月8日，在平顶山市鲁山县董周乡蔡庄村，满山架岭的梨树，硕果累累，长势喜人，前来购买酥梨的人们络绎不绝，对酥梨清凉爽口的味道赞叹不已，几家林业大户正在帮助装车。\r\n贫困户颜满仓高兴的说：“俺种的七亩砀山梨上月卖了一万多元，剩下的这四亩黄冠梨个大、味甜、品质不错，能卖个八、九千元。”'),
(9,'怎样帮助残疾人完成创业孵化——浙江省残疾人创业孵化工作的实践与思考','对正式就业的残疾人，一般应签订劳动合同、缴纳社保并支付最低工资标准以上工资;灵活就业的，如计件劳务报酬等，需符合国家有关规定;如果一家机构成功创业人数较多，部分创业人员可以算作就业(创业是就业的一种形式);但成功就业较多的，不予认定为成功创业。\r\n另外应注意，将残疾人既列为就业人员又列为创业人员的，就业和创业不重复认定。成功创业者，优先认定为创业;目前仍未成功创业的，则只能认定为就业。\r\n除此之外，在对培训、实习和残疾人创业成活率的认定中，我们可以采取量化的方式予以评估。如，培训和实习，应有培训名单、办班通知、办班计划、开班照片等，未达标的予以扣分。而像创业成活率，则可以通过同一孵化期内，孵化成功的创业人数除以成功创业和创业失败人数之和的比率进行计算。'),
(10,'扶贫看精准 就业有“处方”','要对贫困残疾人做到精准帮扶，首先要对他们的基本状况能够精准把握。在助残扶贫的过程中，为了及时准确全面地了解和掌握残疾人的基本状况和需求信息，渭滨区残联在日常残疾人证办理的过程中，就注意将残疾人的生活需求、教育需求、辅具需求和就业需求等基本信息进行详细梳理，并逐个建立了完整的个人档案资料。同时，为了充分发挥基层残疾人组织的作用，区残联通过村级和社区残疾人专职委员入户走访、采集信息、掌握动态，建立健全了全区残疾人基本服务状况和需求信息数据库，进一步提高了残疾人服务的针对性和实效性。123\r\n残疾人要实现增收，最需要的是能掌握一技之长，因此如何高效地开展残疾人的技术培训就显得尤为重要。在实际培训工作中，渭滨区残联从残疾人的需求入手，通过集中连片培训与个别上门指导相结合的形式，对农村残疾人因地制宜做好药材、果蔬、经济作物等种植业和牛、羊、猪、鸡等养殖业的实用技术培训，增强他们依托土地增产增收的能力。'),
(11,'脱贫路上的“独臂鸭司令”','这位被乡亲们称为“独臂鸭司令”的唐大书，是永州市零陵区邮亭圩镇毛坪村的贫困户。1994年，26岁的唐大书上山放炮，炸药过早点燃，不慎被炸伤，送往医院后虽然被抢救过来，却永远失去了右手。为了生活，唐大书学会了用一只手做饭、种地、生活，生活可以自理，但唐大书的日子过得异常艰难。\r\n2014年，扶贫的春风吹进这个小村，独臂的唐大书也被纳入了建档立卡贫困户，起初人们都以为这位残疾人只是来要点钱，政府按照政策给他发放了600元的补贴，没想到唐大书并不领情，找到扶贫干部说：“我不是来领钱的，我想学些技术。”这翻话让扶贫干部刮目相看，扶贫队详细了解他的实际意愿后，让他跟着一名养殖户学习养鸭的技术。');

/*Table structure for table `requests` */

DROP TABLE IF EXISTS `requests`;

CREATE TABLE `requests` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `kind` varchar(255) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `requests` */

insert  into `requests`(`rid`,`username`,`mobile`,`sex`,`kind`,`content`) values 
(7,'市府大道','78945642586','男','视力残疾','大萨达所多'),
(8,'交流空间的','12345698745','男','听力残疾','阿萨德即可打开'),
(9,'你好','18638975648','男','智力残疾','智力不高，会就爱上登记卡活动');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`uid`,`username`,`password`) values 
(1,'圣诞节','123'),
(2,'破咖啡馆','123'),
(7,'开坡口','123'),
(8,'lq','123'),
(9,'123','123'),
(10,'1235+6','1'),
(17,'积极','123'),
(18,'小明','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
