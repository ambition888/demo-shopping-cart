由于上次作业写了 JDBC 异常痛苦(与平常业务开发不同)，确实自己也掌握了。本次使用 master 的 hibernate ORM 进行开发。

思路:
1. 本次作业分为 controller, model, view 三层，使用 restful 风格进行开发


2. view 主要写了 controller 的 request 和 response 的 javabean.
2.1 (个人改进)本次开发过程中，在 javabean 上除了使用 cmd + n 的生成器以外，自己使用了无隅老师推荐的 lombok.Data 的注解减少了 setter 和 getter 的代码。


3. controller 主要是熟练使用 ResponseEntity / PathVariable / RequestBody 等关键字。
3.1 (个人改进)对 controller 内写的 null 判断，我这里使用了 Optional 进行改造(在 CartController 里面)。尝试了 Optional.ofNullable / isPresent / isEmpty / orElseThrow 等等 api


4. model 层需要掌握的是 javax.persistence 的 注解。Entity / Table / Id / GeneratedValue(背不住这个api) / ManyToOne OneToMany OneToOne JoinColumn 这类 left outer join 的关系
4.1 dao 层主要是理解 interface ? extend CrudRepository<T, Long> 这个。以及 CrudRepository 里面的接口 save findAll 。