# Advanced Calculator System — Guide / دليل واضح

## English
### 1) What this app does
- Console Java calculator with addition, division, power, and square root.
- Built to showcase OOP pillars: abstraction, inheritance, polymorphism, encapsulation, composition, constructors, constants, and user I/O via `Scanner`.

### 2) How to run
1. Compile: `javac *.java`
2. Run: `java CalculatorApp`
3. Follow the menu, enter numbers, and see results. Invalid inputs (division by zero, negative square root, non-numeric entries) are handled with clear messages.

### 3) How to teach it
- Abstraction: `Operation` defines the shared contract (`calculate`) and a protected `symbol`.
- Inheritance: `BinaryOperation` and `UnaryOperation` extend `Operation` to specialize two-operand vs one-operand behavior.
- Polymorphism: `CalculatorApp` keeps an `Operation` reference (`currentOperation`) and swaps concrete operations at runtime; calls to `calculate` dispatch to the correct override.
- Encapsulation: `symbol` is protected with a getter; consumers avoid direct field access.
- Constructors: Each operation passes its symbol upward; `CalculatorApp` has default and parameterized constructors (for custom `Scanner` during testing).
- Composition: `CalculatorApp` has an `Operation` instance instead of inheriting from it.
- Constants: `Division.ERROR_MESSAGE` and `SquareRoot.NEGATIVE_INPUT_MESSAGE` centralize reusable error text.
- Error handling: `InputMismatchException` is caught for bad user input, `IllegalArgumentException` for invalid math cases.

### 4) Class reference
- `Operation` (abstract): base symbol + `calculate(a, b)`.
- `BinaryOperation` (abstract): two-operand specialization.
- `UnaryOperation` (abstract): one-operand specialization; overrides `calculate(a, b)` to delegate to `calculate(a)`.
- `Addition`: sums two numbers.
- `Division`: divides with zero check; uses `ERROR_MESSAGE`.
- `Power`: exponentiation via `Math.pow`.
- `SquareRoot`: square root with negative check; uses `NEGATIVE_INPUT_MESSAGE`.
- `CalculatorApp`: menu UI, reads with `Scanner`, selects operations polymorphically, prints results.

---

## العربية
### 1) ماذا يفعل التطبيق
- آلة حاسبة عبر سطر الأوامر في جافا تدعم الجمع والقسمة والأس والجذر التربيعي.
- مصممة لإبراز مبادئ البرمجة الكائنية: التجريد، الوراثة، التعددية الشكلية، التغليف، التركيب، البُناة، الثوابت، والتعامل مع المدخلات بـ `Scanner`.

### 2) طريقة التشغيل
1. الترجمة: `javac *.java`
2. التشغيل: `java CalculatorApp`
3. اتبع القائمة، أدخل الأرقام، وشاهد النتيجة. تتم معالجة الإدخالات غير الصحيحة (قسمة على صفر، جذر عدد سالب، مدخلات غير رقمية) برسائل واضحة.

### 3) كيفية شرحه
- التجريد: الفئة `Operation` تضع عقدة مشتركة (`calculate`) ورمزًا محميًا.
- الوراثة: الفئتان `BinaryOperation` و`UnaryOperation` ترثان من `Operation` لتخصيص السلوك الثنائي أو الأحادي.
- التعددية الشكلية: الفئة `CalculatorApp` تحتفظ بمرجع `Operation` (`currentOperation`) وتبدّل العمليات الملموسة وقت التشغيل؛ استدعاء `calculate` يذهب للتنفيذ المعاد تعريفه في الفئة الفرعية.
- التغليف: المتغير `symbol` محمي وله Getter؛ لا يوجد وصول مباشر للحقل.
- البُناة: كل عملية تمرر الرمز إلى باني الفئة الأعلى؛ `CalculatorApp` يوفر بانيًا افتراضيًا وآخر مخصصًا (لـ `Scanner` مخصص أثناء الاختبار).
- التركيب: `CalculatorApp` تمتلك كائنًا من نوع `Operation` بدلاً من الوراثة منه.
- الثوابت: `Division.ERROR_MESSAGE` و`SquareRoot.NEGATIVE_INPUT_MESSAGE` توحدان نصوص الأخطاء.
- معالجة الأخطاء: يتم التقاط `InputMismatchException` للمدخلات غير الصحيحة و`IllegalArgumentException` للحالات الرياضية غير الصالحة.

### 4) مرجع الفئات
- `Operation` (مجردة): الرمز + `calculate(a, b)`.
- `BinaryOperation` (مجردة): تخصص للعمليات ثنائية المعامل.
- `UnaryOperation` (مجردة): تخصص للعمليات أحادية المعامل؛ تعيد تعريف `calculate(a, b)` لتفويض التنفيذ إلى `calculate(a)`.
- `Addition`: جمع رقمين.
- `Division`: قسمة مع فحص الصفر؛ تستخدم `ERROR_MESSAGE`.
- `Power`: أس باستخدام `Math.pow`.
- `SquareRoot`: جذر تربيعي مع فحص السالب؛ تستخدم `NEGATIVE_INPUT_MESSAGE`.
- `CalculatorApp`: واجهة القائمة، قراءة المدخلات بـ `Scanner`، اختيار العمليات تعدديًا، وطباعة النتائج.
