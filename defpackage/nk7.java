package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: nk7  reason: default package */
public final class nk7 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ok7 Y;
    public final /* synthetic */ v2f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk7(ok7 ok7, v2f v2f, Continuation continuation) {
        super(2, continuation);
        this.Y = ok7;
        this.Z = v2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nk7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nk7 nk7 = new nk7(this.Y, this.Z, continuation);
        nk7.X = obj;
        return nk7;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        for (Bitmap bitmap : (List) this.Y.d.getValue()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        ((MediaMetadataRetriever) this.Y.f.getValue()).setDataSource(this.Z.l().getPath());
        try {
            String extractMetadata = ((MediaMetadataRetriever) this.Y.f.getValue()).extractMetadata(9);
            this.Y.h = extractMetadata != null ? Long.parseLong(extractMetadata) : this.Z.c();
        } catch (Exception e) {
            udd.s(this.Y.b, "Can't extract duration", e);
            this.Y.h = this.Z.c();
        }
        ArrayList arrayList = new ArrayList();
        int i = this.Y.g;
        int i2 = 0;
        while (true) {
            jue jue = jue.a;
            if (i2 >= i || !n1g.A(ou3)) {
                return jue;
            }
            long j = this.Y.h;
            ok7 ok7 = this.Y;
            long j2 = (j / ((long) ok7.g)) * ((long) i2) * 1000;
            uy5 uy5 = ok7.a;
            Bitmap scaledFrameAtTime = ((MediaMetadataRetriever) ok7.f.getValue()).getScaledFrameAtTime(j2, 2, uy5.b, uy5.c);
            if (scaledFrameAtTime != null && n1g.A(ou3)) {
                arrayList.add(scaledFrameAtTime);
                this.Y.d.m((Object) null, arrayList);
            }
            i2++;
        }
    }
}
