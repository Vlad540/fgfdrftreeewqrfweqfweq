package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

/* renamed from: yyf  reason: default package */
public final class yyf implements ima {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ d4b b;

    public yyf(d4b d4b, BasePendingResult basePendingResult) {
        this.b = d4b;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
