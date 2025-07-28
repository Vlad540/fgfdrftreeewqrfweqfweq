package defpackage;

/* renamed from: v23  reason: default package */
public final class v23 extends b97 implements u16 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v23(int i) {
        super(1);
        this.a = i;
    }

    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(hr1.h(new StringBuilder("Collection doesn't contain element at index "), this.a, '.'));
    }
}
