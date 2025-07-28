package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: ae6  reason: default package */
public final class ae6 extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae6(int i, s16 s16) {
        super(0);
        this.a = i;
        this.b = s16;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                try {
                    return (List) this.b.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return hw4.a;
                }
            default:
                return (cbf) this.b.invoke();
        }
    }
}
