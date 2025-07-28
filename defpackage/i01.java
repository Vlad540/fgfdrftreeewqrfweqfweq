package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: i01  reason: default package */
public final class i01 extends l5e implements m26 {
    public /* synthetic */ CallsAudioDeviceInfo X;
    public /* synthetic */ u81 Y;
    public /* synthetic */ boolean Z;
    public final /* synthetic */ u01 w0;
    public final /* synthetic */ t97 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i01(u01 u01, t97 t97, Continuation continuation) {
        super(4, continuation);
        this.w0 = u01;
        this.x0 = t97;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        i01 i01 = new i01(this.w0, this.x0, (Continuation) obj4);
        i01.X = (CallsAudioDeviceInfo) obj;
        i01.Y = (u81) obj2;
        i01.Z = booleanValue;
        jue jue = jue.a;
        i01.o(jue);
        return jue;
    }

    public final Object o(Object obj) {
        Object value;
        hy7 hy7;
        hy7 hy72;
        l31 b;
        wx3.H(obj);
        CallsAudioDeviceInfo callsAudioDeviceInfo = this.X;
        u81 u81 = this.Y;
        boolean z = this.Z;
        u01 u01 = this.w0;
        grd grd = u01.x0;
        do {
            value = grd.getValue();
            wp0 wp0 = (wp0) value;
            hy7 = u81.r;
            hy72 = hy7.o;
            if (u81.g && !(u81.e instanceof a65) && ((jb5) this.x0.getValue()).p()) {
                hy72 = z ? hy7.b : hy7.a;
            }
            b = au7.b(callsAudioDeviceInfo, u01.c.u());
            wp0.getClass();
        } while (!grd.b(value, new wp0(hy7, u81.q, hy72, b)));
        return jue.a;
    }
}
