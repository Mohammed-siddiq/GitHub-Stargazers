# GitHub Languages Stargazer
_A scala project modelling important attributes of Github repositories, using githubs v4 API over graphql_.

Interesting facts, figures and attributes are queried from github for various languages. This utility can be used to get a snapshot of happenings across repositories for a particular language
 
To demonstrate, querying over popular languages like Java, Scala, Python, C and C++. 

For each of the above languages the following metrics are captured : 

- **Top 100 starred repositories with**
    - Repo Name
    - Repo Description
    - Repo URL
    - Total number of Forks
    - Total number of stars
    - Total number of Issues
    - Total number of Watchers
    - Total number of Pull Requests
    - Total releases done
    - Number of Repos
    
- **For each of the above REPOSITORIES, latest bugs/issues are fetched with**
    - Issue details 
    - When was it created 
    - URL
    - The user who created it
- **The latest pull requests with**
    - user creating a pull request
    - summary of the PR
    - status of PR, whether merged or not
    - URL of PR
- **Latest commit comments on the REPOSITORY with**
    - The author of the comment
    - Comment body
    - Date commented
    
## Design patterns in use

- **Facade** : A single facade is exposed to tbe driver program which queries,processes and returns the result
- **Chain of Responsibility** : Decouples the sender of query processor from processing by giving multiple objects(based on the type of query) to handle the processing.
- **Singleton** : Helpers and utils use this pattern since they have no state (or a single global state)
- **Builder** : All the models/Objects use builder pattern for instantiating

_Note:_  _Code which uses these patterns have their package named after the design patterns_

## Steps to Run

- Clone this repo : 

```
git clone https://Iam_MohammedSiddiq@bitbucket.org/Iam_MohammedSiddiq/mohammed_siddiq_474_hw1.git
```            
- Run the following command

```
sbt clean compile run
```


_NOTE : Requires sbt for running the above command_




## Execution snapshot

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                             Top 100 starred repos for java language
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
|Sl. No    |Repo. Name                    |URL                                                         |Forks     |Releases  |Commits   |Pull-Requests       |Watchers  |Stars     |Issues    |
-----------|:-----------------------------|:-----------------------------------------------------------|:--------:|:--------:|:--------:|:------------------:|:--------:|:--------:|---------:|
|1         |"JavaGuide"                   |"https://github.com/Snailclimb/JavaGuide"                   |18731     |0         |6         |278                 |3074      |55935     |206       |
|2         |"java-design-patterns"        |"https://github.com/iluwatar/java-design-patterns"          |16641     |0         |40        |456                 |4049      |51461     |462       |
|3         |"spring-boot"                 |"https://github.com/spring-projects/spring-boot"            |26951     |36        |696       |3675                |3329      |42075     |14636     |
|4         |"LeetCodeAnimation"           |"https://github.com/MisterBooo/LeetCodeAnimation"           |7077      |0         |0         |9                   |1912      |41197     |20        |
|5         |"RxJava"                      |"https://github.com/ReactiveX/RxJava"                       |6810      |180       |100       |3252                |2370      |40565     |2773      |
|6         |"interviews"                  |"https://github.com/kdn251/interviews"                      |8089      |0         |1         |96                  |2279      |38959     |36        |
|7         |"retrofit"                    |"https://github.com/square/retrofit"                        |6242      |27        |92        |956                 |1617      |33756     |2246      |
|8         |"spring-framework"            |"https://github.com/spring-projects/spring-framework"       |21140     |158       |515       |2444                |3420      |32470     |18593     |
|9         |"dubbo"                       |"https://github.com/apache/dubbo"                           |19205     |21        |121       |2227                |3256      |29277     |2872      |
|10        |"proxyee-down"                |"https://github.com/proxyee-down-org/proxyee-down"          |4565      |49        |7         |33                  |980       |24998     |0         |
|11        |"butterknife"                 |"https://github.com/JakeWharton/butterknife"                |4628      |0         |25        |471                 |1116      |24606     |1077      |
|12        |"zxing"                       |"https://github.com/zxing/zxing"                            |8371      |26        |38        |259                 |1667      |23671     |938       |
|13        |"JCSprout"                    |"https://github.com/crossoverJie/JCSprout"                  |6239      |0         |7         |92                  |1604      |22452     |80        |
|14        |"mall"                        |"https://github.com/macrozheng/mall"                        |8802      |0         |4         |27                  |1185      |21992     |170       |
|15        |"EventBus"                    |"https://github.com/greenrobot/EventBus"                    |4374      |4         |5         |104                 |1115      |21651     |501       |
|16        |"netty"                       |"https://github.com/netty/netty"                            |9638      |0         |4108      |4789                |1753      |20840     |4783      |
|17        |"jadx"                        |"https://github.com/skylot/jadx"                            |2243      |12        |12        |213                 |679       |19989     |534       |
|18        |"SmartRefreshLayout"          |"https://github.com/scwang90/SmartRefreshLayout"            |3907      |7         |0         |16                  |488       |18803     |1021      |
|19        |"RxAndroid"                   |"https://github.com/ReactiveX/RxAndroid"                    |2847      |17        |17        |217                 |1056      |18463     |326       |
|20        |"Hystrix"                     |"https://github.com/Netflix/Hystrix"                        |3777      |79        |16        |787                 |1636      |18304     |975       |
|21        |"p3c"                         |"https://github.com/alibaba/p3c"                            |4368      |0         |5         |81                  |1189      |18231     |501       |
|22        |"ghidra"                      |"https://github.com/NationalSecurityAgency/ghidra"          |2213      |0         |14        |191                 |729       |17511     |875       |
|23        |"apollo"                      |"https://github.com/ctripcorp/apollo"                       |6112      |20        |5         |965                 |1243      |17191     |1647      |
|24        |"tutorials"                   |"https://github.com/eugenp/tutorials"                       |25641     |0         |24        |7566                |1317      |17132     |315       |
|25        |"picasso"                     |"https://github.com/square/picasso"                         |3958      |6         |70        |645                 |938       |17033     |1466      |
|26        |"gson"                        |"https://github.com/google/gson"                            |3272      |0         |11        |375                 |739       |16527     |1197      |
|27        |"selenium"                    |"https://github.com/SeleniumHQ/selenium"                    |5149      |27        |629       |1616                |1301      |15656     |5923      |
|28        |"HanLP"                       |"https://github.com/hankcs/HanLP"                           |4235      |45        |52        |87                  |998       |14914     |1196      |
|29        |"tinker"                      |"https://github.com/Tencent/tinker"                         |2878      |28        |4         |98                  |720       |14243     |1144      |
|30        |"Material-Animations"         |"https://github.com/lgvalle/Material-Animations"            |2544      |0         |2         |24                  |532       |13022     |40        |
|31        |"bazel"                       |"https://github.com/bazelbuild/bazel"                       |2157      |73        |375       |2602                |554       |12867     |6803      |
|32        |"symphony"                    |"https://github.com/b3log/symphony"                         |3741      |33        |24        |123                 |464       |12700     |838       |
|33        |"Telegram"                    |"https://github.com/DrKLO/Telegram"                         |4841      |0         |396       |383                 |1030      |12514     |0         |
|34        |"CircleImageView"             |"https://github.com/hdodenhof/CircleImageView"              |2784      |0         |3         |51                  |407       |12350     |294       |
|35        |"java8-tutorial"              |"https://github.com/winterbe/java8-tutorial"                |2892      |0         |2         |34                  |908       |12224     |0         |
|36        |"mybatis-3"                   |"https://github.com/mybatis/mybatis-3"                      |7553      |29        |96        |763                 |1174      |11890     |907       |
|37        |"Signal-Android"              |"https://github.com/signalapp/Signal-Android"               |3042      |0         |786       |2081                |715       |11879     |6926      |
|38        |"seata"                       |"https://github.com/seata/seata"                            |2968      |23        |4         |837                 |752       |11843     |874       |
|39        |"GSYVideoPlayer"              |"https://github.com/CarGuo/GSYVideoPlayer"                  |2660      |13        |0         |19                  |350       |11818     |2216      |
|40        |"FizzBuzzEnterpriseEdition"   |"https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition"|537       |0         |37        |103                 |185       |11718     |335       |
|41        |"zipkin"                      |"https://github.com/openzipkin/zipkin"                      |2148      |55        |117       |1760                |723       |11713     |1059      |
|42        |"greenDAO"                    |"https://github.com/greenrobot/greenDAO"                    |2780      |7         |14        |119                 |548       |11668     |874       |
|43        |"solo"                        |"https://github.com/b3log/solo"                             |3145      |38        |41        |234                 |558       |11596     |1039      |
|44        |"stetho"                      |"https://github.com/facebook/stetho"                        |1054      |12        |12        |304                 |394       |11456     |348       |
|45        |"springboot-learning-example" |"https://github.com/JeffLi1993/springboot-learning-example" |5656      |0         |8         |22                  |893       |11107     |65        |
|46        |"androidannotations"          |"https://github.com/androidannotations/androidannotations"  |2454      |0         |86        |623                 |689       |10907     |1621      |
|47        |"react-native-navigation"     |"https://github.com/wix/react-native-navigation"            |2390      |1         |115       |1621                |488       |10794     |2604      |
|48        |"Luban"                       |"https://github.com/Curzibn/Luban"                          |1849      |6         |2         |31                  |326       |10724     |322       |
|49        |"redisson"                    |"https://github.com/redisson/redisson"                      |2629      |72        |124       |270                 |799       |10682     |2065      |
|50        |"graal"                       |"https://github.com/oracle/graal"                           |668       |29        |70        |496                 |412       |10450     |1199      |
|51        |"VasSonic"                    |"https://github.com/Tencent/VasSonic"                       |1407      |10        |1         |115                 |374       |10224     |223       |
|52        |"vert.x"                      |"https://github.com/eclipse-vertx/vert.x"                   |1581      |0         |263       |1496                |608       |10202     |1617      |
|53        |"Matisse"                     |"https://github.com/zhihu/Matisse"                          |1558      |14        |9         |140                 |218       |10195     |534       |
|54        |"xxl-job"                     |"https://github.com/xuxueli/xxl-job"                        |4338      |26        |6         |150                 |768       |10134     |1008      |
|55        |"DoraemonKit"                 |"https://github.com/didi/DoraemonKit"                       |1289      |3         |0         |92                  |256       |10121     |198       |
|56        |"vhr"                         |"https://github.com/lenve/vhr"                              |3953      |0         |2         |10                  |547       |9941      |135       |
|57        |"android-Ultra-Pull-To-Refresh"|"https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh"|2825      |8         |6         |49                  |460       |9682      |294       |
|58        |"hadoop"                      |"https://github.com/apache/hadoop"                          |5986      |0         |58        |1513                |1039      |9607      |0         |
|59        |"recyclerview-animators"      |"https://github.com/wasabeef/recyclerview-animators"        |1825      |0         |0         |53                  |316       |9532      |121       |
|60        |"Arduino"                     |"https://github.com/arduino/Arduino"                        |6560      |28        |277       |1350                |971       |9518      |7624      |
|61        |"Android-ObservableScrollView"|"https://github.com/ksoichiro/Android-ObservableScrollView" |2117      |0         |16        |25                  |414       |9453      |261       |
|62        |"mockito"                     |"https://github.com/mockito/mockito"                        |1676      |33        |133       |843                 |411       |9440      |941       |
|63        |"PocketHub"                   |"https://github.com/pockethub/PocketHub"                    |3642      |1         |74        |601                 |981       |9426      |652       |
|64        |"litemall"                    |"https://github.com/linlinjava/litemall"                    |3593      |5         |5         |77                  |542       |9399      |201       |
|65        |"PermissionsDispatcher"       |"https://github.com/permissions-dispatcher/PermissionsDispatcher"|1277      |38        |21        |252                 |280       |9393      |389       |
|66        |"easyexcel"                   |"https://github.com/alibaba/easyexcel"                      |2452      |1         |4         |48                  |423       |9393      |587       |
|67        |"pinpoint"                    |"https://github.com/naver/pinpoint"                         |2875      |31        |9         |3628                |793       |9337      |2395      |
|68        |"uCrop"                       |"https://github.com/Yalantis/uCrop"                         |1625      |8         |1         |124                 |256       |9166      |448       |
|69        |"FlycoTabLayout"              |"https://github.com/H07000223/FlycoTabLayout"               |2009      |4         |1         |17                  |227       |9135      |431       |
|70        |"MaterialDesignLibrary"       |"https://github.com/navasmdc/MaterialDesignLibrary"         |2402      |3         |1         |91                  |540       |9079      |331       |
|71        |"QMUI_Android"                |"https://github.com/Tencent/QMUI_Android"                   |1710      |22        |2         |22                  |259       |9075      |691       |
|72        |"Fragmentation"               |"https://github.com/YoKeyword/Fragmentation"                |1924      |30        |4         |42                  |306       |9051      |1152      |
|73        |"storm"                       |"https://github.com/nathanmarz/storm"                       |1766      |0         |19        |304                 |1075      |9036      |0         |
|74        |"rocketmq"                    |"https://github.com/apache/rocketmq"                        |4706      |0         |21        |902                 |763       |9035      |579       |
|75        |"RxPermissions"               |"https://github.com/tbruyelle/RxPermissions"                |1116      |9         |2         |63                  |217       |9002      |239       |
|76        |"FileDownloader"              |"https://github.com/lingochamp/FileDownloader"              |1817      |65        |4         |57                  |309       |8906      |1221      |
|77        |"banner"                      |"https://github.com/youth5201314/banner"                    |1784      |0         |1         |18                  |210       |8868      |609       |
|78        |"Sentinel"                    |"https://github.com/alibaba/Sentinel"                       |2581      |12        |1         |352                 |591       |8842      |711       |
|79        |"Apktool"                     |"https://github.com/iBotPeaches/Apktool"                    |2249      |11        |75        |213                 |580       |8830      |1959      |
|80        |"Android-PullToRefresh"       |"https://github.com/chrisbanes/Android-PullToRefresh"       |5007      |0         |17        |80                  |996       |8822      |0         |
|81        |"MVPArms"                     |"https://github.com/JessYanCoding/MVPArms"                  |2117      |25        |12        |65                  |317       |8809      |269       |
|82        |"platform_frameworks_base"    |"https://github.com/aosp-mirror/platform_frameworks_base"   |5512      |0         |130       |98                  |887       |8768      |0         |
|83        |"AndroidSlidingUpPanel"       |"https://github.com/umano/AndroidSlidingUpPanel"            |2282      |8         |19        |164                 |368       |8640      |807       |
|84        |"incubator-druid"             |"https://github.com/apache/incubator-druid"                 |2179      |35        |262       |5594                |623       |8629      |2975      |
|85        |"toBeTopJavaer"               |"https://github.com/hollischuang/toBeTopJavaer"             |1924      |0         |0         |21                  |420       |8592      |15        |
|86        |"guice"                       |"https://github.com/google/guice"                           |1264      |10        |14        |209                 |566       |8542      |1060      |
|87        |"halo"                        |"https://github.com/halo-dev/halo"                          |2426      |37        |39        |63                  |253       |8539      |249       |
|88        |"nacos"                       |"https://github.com/alibaba/nacos"                          |2206      |19        |8         |530                 |640       |8487      |1346      |
|89        |"spark"                       |"https://github.com/perwendel/spark"                        |1479      |0         |16        |460                 |443       |8480      |680       |
|90        |"webmagic"                    |"https://github.com/code4craft/webmagic"                    |3604      |20        |2         |133                 |822       |8411      |755       |
|91        |"eureka"                      |"https://github.com/Netflix/eureka"                         |2342      |111       |14        |730                 |943       |8407      |482       |
|92        |"Calligraphy"                 |"https://github.com/chrisjenx/Calligraphy"                  |1082      |4         |10        |98                  |225       |8392      |377       |
|93        |"tink"                        |"https://github.com/google/tink"                            |649       |10        |35        |105                 |358       |8392      |150       |
|94        |"lombok"                      |"https://github.com/rzwitserloot/lombok"                    |1556      |0         |47        |237                 |413       |8346      |2009      |
|95        |"AndroidAutoSize"             |"https://github.com/JessYanCoding/AndroidAutoSize"          |1144      |12        |6         |5                   |157       |8307      |216       |
|96        |"zuul"                        |"https://github.com/Netflix/zuul"                           |1623      |3         |5         |224                 |849       |8181      |399       |
|97        |"glide-transformations"       |"https://github.com/wasabeef/glide-transformations"         |1249      |0         |8         |36                  |196       |8147      |129       |
|98        |"DanmakuFlameMaster"          |"https://github.com/bilibili/DanmakuFlameMaster"            |1949      |5         |26        |62                  |402       |8121      |369       |
|99        |"auto"                        |"https://github.com/google/auto"                            |910       |31        |23        |391                 |381       |8120      |369       |




