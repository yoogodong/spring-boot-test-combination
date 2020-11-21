## 目的
- 将单个的测试方法组合为一个场景
- junit5 目前没有提供 testsuite 的方案， 其@tag 虽然可以聚合测试方法，但是不能像 tsetsuite 那样将场景记录下来

## 发现的问题
- 事务范围被扩大， SuiteTest 继承 BaseIT, 将每个测试方法的事务范围扩大至场景范围，所以不应用让 SuiteTest 继承BaseIT, 而是直接标注 SpringBootTest