package defpackage;

/* renamed from: ama  reason: default package */
public final class ama {
    public final Integer a;
    public final Integer b;
    public final Boolean c;

    public ama(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d) {
        this.a = num;
        this.b = num2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ama)) {
            return false;
        }
        ama ama = (ama) obj;
        return hhd.f(this.a, ama.a) && hhd.f(this.b, ama.b) && hhd.f(this.c, ama.c) && hhd.f((Object) null, (Object) null) && hhd.f((Object) null, (Object) null) && hhd.f((Object) null, (Object) null);
    }

    public final int hashCode() {
        int i = 0;
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (hashCode2 + i) * 29791;
    }

    public final String toString() {
        return "AudioAdaptationParams(minEncoderBitrateKBps=" + this.a + ", minPayloadBitrateKBps=" + this.b + ", useSlowAdaptation=" + this.c + ", minBitrateConstraintBps=null, maxBitrateConstraintBps=null, bitratePriority=null)";
    }
}
