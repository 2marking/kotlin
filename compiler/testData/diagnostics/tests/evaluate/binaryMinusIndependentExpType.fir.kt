val p1: Int = 1 - 1
val p2: Long = 1 - 1
val p3: Byte = 1 - 1
val p4: Short = 1 - 1

val l1: Long = 1 - 1.toLong()
val l2: Byte = 1 - 1.toLong()
val l3: Int = 1 - 1.toLong()
val l4: Short = 1 - 1.toLong()

val b1: Byte = 1 - 1.toByte()
val b2: Int = 1 - 1.toByte()
val b3: Long = 1 - 1.toByte()
val b4: Short = 1 - 1.toByte()

val i1: Byte = 1 - 1.<!REDUNDANT_CALL_OF_CONVERSION_METHOD!>toInt()<!>
val i2: Int = 1 - 1.<!REDUNDANT_CALL_OF_CONVERSION_METHOD!>toInt()<!>
val i3: Long = 1 - 1.<!REDUNDANT_CALL_OF_CONVERSION_METHOD!>toInt()<!>
val i4: Short = 1 - 1.<!REDUNDANT_CALL_OF_CONVERSION_METHOD!>toInt()<!>

val s1: Byte = 1 - 1.toShort()
val s2: Int = 1 - 1.toShort()
val s3: Long = 1 - 1.toShort()
val s4: Short = 1 - 1.toShort()