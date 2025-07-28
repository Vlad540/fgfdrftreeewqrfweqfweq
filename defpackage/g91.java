package defpackage;

import android.content.Intent;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: g91  reason: default package */
public final /* synthetic */ class g91 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g91(h91 h91, k11 k11, boolean z) {
        this.a = 0;
        this.c = k11;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Intent intent = (Intent) obj;
                intent.setAction("action-accept-call");
                k11 k11 = (k11) this.c;
                CharSequence charSequence = k11.b;
                String str = null;
                if (charSequence == null) {
                    charSequence = null;
                }
                intent.putExtra("incoming_param_name", charSequence);
                String str2 = k11.c;
                if (str2 != null) {
                    str = Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0);
                }
                intent.putExtra("incoming_param_avatar", str);
                Long l = k11.a;
                intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0);
                intent.putExtra("incoming_param_is_video", this.b);
                return jue.a;
            case 1:
                ((Boolean) obj).booleanValue();
                ((gm1) this.c).K0.setVisibility(this.b ? 0 : 8);
                return jue.a;
            default:
                int ordinal = ((jba) obj).ordinal();
                fgb fgb = (fgb) this.c;
                if (ordinal == 0 || ordinal == 1) {
                    fgb.s();
                } else {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            fgb.C(this.b);
                        } else if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    fgb.W0 = false;
                }
                return jue.a;
        }
    }

    public /* synthetic */ g91(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }
}
