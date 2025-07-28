package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.views.ActProfilePhoto;

/* renamed from: pv0  reason: default package */
public final /* synthetic */ class pv0 implements otc, j75, k75, of3, tle, kt0, NativeDoubleArrayConsumer.Consumer, x89, j26, l96 {
    public static final pv0 X = new pv0(3);
    public static final pv0 Y = new pv0(4);
    public static final pv0 Z = new pv0(5);
    public static final pv0 b = new pv0(0);
    public static final pv0 c = new pv0(1);
    public static final pv0 o = new pv0(2);
    public final /* synthetic */ int a;

    public /* synthetic */ pv0(int i) {
        this.a = i;
    }

    public d75[] a() {
        switch (this.a) {
            case 7:
                return new d75[]{new r3()};
            case 9:
                return new d75[]{new v3()};
            default:
                return new d75[]{new ec()};
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                Throwable th = (Throwable) obj;
                HashSet hashSet = ActAttachesView.D1;
                return;
            case 12:
                int i = ActContactAvatars.l1;
                udd.s("ru.ok.messages.contacts.profile.ActContactAvatars", "During deleting self photo got error", (Throwable) obj);
                return;
            case 13:
                int i2 = ActContactAvatars.l1;
                udd.s("ru.ok.messages.contacts.profile.ActContactAvatars", "During making photo main got error", (Throwable) obj);
                return;
            case 21:
                ((m00) obj).i = g10.X;
                return;
            case 22:
                Throwable th2 = (Throwable) obj;
                udd.r("uy", "Can't update not started live video");
                return;
            case 23:
                int i3 = AttachPhotoView.Y0;
                udd.s("ru.ok.messages.media.attaches.AttachPhotoView", "Can't save file", (Throwable) obj);
                return;
            case 26:
                udd.s("nt7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
            case 27:
                udd.s("nt7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
            case 28:
                udd.s("nt7", "setMapStyle: can't load map style", (Throwable) obj);
                return;
            default:
                udd.s("nt7", "loadMarkerIcon: can't load marker", (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        return Uri.fromFile((File) obj);
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
    }

    public void consume(Double[] dArr) {
    }

    public lt0 e(Bundle bundle) {
        t8[] t8VarArr;
        switch (this.a) {
            case 15:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    t8VarArr = new t8[0];
                } else {
                    t8[] t8VarArr2 = new t8[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        t8VarArr2[i] = (t8) t8.w0.e((Bundle) parcelableArrayList.get(i));
                    }
                    t8VarArr = t8VarArr2;
                }
                return new v8(t8VarArr, bundle.getLong(Integer.toString(2, 36), 0), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i2 = bundle.getInt(Integer.toString(1, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                return new t8(j, i2, intArray == null ? new int[0] : intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    public Object f(ws8 ws8) {
        return em7.a(ws8);
    }

    public String g(yz3 yz3) {
        String str = yz3.h;
        return str != null ? str : yz3.a.toString();
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ms6, ts6] */
    public ws6 h(String str) {
        ws6 ws6;
        ws6 f = by4.f(str);
        fb4 fb4 = new fb4(1, str);
        f.getClass();
        t27 t27 = new t27(f, fb4);
        if (t27 instanceof Collection) {
            ws6 = ws6.j((Collection) t27);
        } else {
            p1 p1Var = (p1) t27.iterator();
            if (!p1Var.hasNext()) {
                ws6 = e8c.X;
            } else {
                Object next = p1Var.next();
                if (!p1Var.hasNext()) {
                    ws6 = ws6.n(next);
                } else {
                    ? ms6 = new ms6(4);
                    ms6.a(next);
                    while (p1Var.hasNext()) {
                        ms6.a(p1Var.next());
                    }
                    ws6 = ms6.j();
                }
            }
        }
        return ws6.isEmpty() ? f : ws6;
    }

    public int i(int i) {
        int i2 = AboutAppSettingsScreen.c;
        return 4;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        int i = ActProfilePhoto.c1;
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public e75[] m51a() {
        switch (this.a) {
            case 8:
                return new e75[]{new s3()};
            case 10:
                return new e75[]{new w3()};
            default:
                return new e75[]{new fc(0)};
        }
    }
}
