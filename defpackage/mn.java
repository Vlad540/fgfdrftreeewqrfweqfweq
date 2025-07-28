package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.deeplink.InvalidDeeplinkNamingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mn  reason: default package */
public class mn implements i36, wm0, c6c, g73, lja, hx9, u97, vgd, wq6 {
    public static final int[] o = {16843067, 16843068};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public mn(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = new Object();
                return;
            case 12:
                this.b = BuildConfig.FLAVOR;
                this.c = new ArrayList();
                return;
            case 13:
                this.b = new Object();
                return;
            case 15:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                AtomicReference atomicReference = new AtomicReference();
                this.b = atomicReference;
                AtomicReference atomicReference2 = new AtomicReference();
                this.c = atomicReference2;
                AtomicReference atomicReference3 = new AtomicReference();
                atomicReference2.lazySet(atomicReference3);
                f89 f89 = (f89) atomicReference.getAndSet(atomicReference3);
                return;
            case 29:
                this.b = new pq3(vhc.e, new hge(whc.j), Integer.valueOf(phc.c0), (Integer) null, 20);
                this.c = new pq3(vhc.a, new hge(whc.g), Integer.valueOf(zhc.t), (Integer) null, 20);
                return;
            default:
                this.b = new Rect();
                this.c = new Rect();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, e06] */
    public static y64 v(jjd jjd) {
        g84 g84 = new g84();
        g84.b = null;
        jjd.getClass();
        jjd.getClass();
        ? obj = new Object();
        swb.e(true);
        obj.b = g84;
        obj.c = null;
        obj.a = false;
        obj.o = new HashMap();
        jjd.getClass();
        throw null;
    }

    public void A(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.A(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void B(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.B(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void C(a aVar, boolean z) {
        c cVar = (c) this.b;
        Context context = cVar.w.B0;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.g0().o.C(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void D(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.D(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void E(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.E(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void F(a aVar, Bundle bundle, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.F(aVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void G(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.G(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void H(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.H(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void I(a aVar, View view, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.I(aVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                duf duf = kx5.a;
                c cVar = (c) this.b;
                if (aVar == ((a) duf.a)) {
                    mn mnVar = cVar.o;
                    synchronized (((CopyOnWriteArrayList) mnVar.c)) {
                        int size = ((CopyOnWriteArrayList) mnVar.c).size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            } else if (((kx5) ((CopyOnWriteArrayList) mnVar.c).get(i)).a == duf) {
                                ((CopyOnWriteArrayList) mnVar.c).remove(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    ((o88) duf.c).getClass();
                    o88.C(view, (FrameLayout) duf.b);
                } else {
                    continue;
                }
            }
        }
    }

    public void J(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.J(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public byte[] K(v05 v05) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        try {
            dataOutputStream.writeBytes(v05.a);
            dataOutputStream.writeByte(0);
            String str = v05.b;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(v05.c);
            dataOutputStream.writeLong(v05.o);
            dataOutputStream.write(v05.X);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public mo4 L(j68 j68) {
        j68.b.getClass();
        j68.b.getClass();
        return mo4.a;
    }

    public b M() {
        im imVar = (im) ((WeakReference) this.c).get();
        a aVar = (a) ((WeakReference) this.b).get();
        return (imVar != null || aVar == null) ? imVar : aVar.c0();
    }

    public w38 N() {
        MediaController.PlaybackInfo playbackInfo = ((v38) this.b).a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new w38(playbackInfo.getPlaybackType(), new m20(new l20(playbackInfo.getAudioAttributes())), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    public cya O() {
        v38 v38 = (v38) this.b;
        mn6 a2 = v38.e.a();
        if (a2 != null) {
            try {
                return a2.getPlaybackState();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = v38.a.getPlaybackState();
        if (playbackState != null) {
            return cya.a(playbackState);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x38, y38] */
    public y38 P() {
        return new x38(((v38) this.b).a.getTransportControls());
    }

    public void Q(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = (ProgressBar) this.b;
        ydc D = ydc.D(progressBar.getContext(), attributeSet, o, i, 0);
        Drawable z = D.z(0);
        if (z != null) {
            if (z instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) z;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable W = W(animationDrawable.getFrame(i2), true);
                    W.setLevel(10000);
                    animationDrawable2.addFrame(W, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                z = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(z);
        }
        Drawable z2 = D.z(1);
        if (z2 != null) {
            progressBar.setProgressDrawable(W(z2, false));
        }
        D.E();
    }

    public void R(vt5 vt5) {
        int i = vt5.b;
        Handler handler = (Handler) this.c;
        fte fte = (fte) this.b;
        if (i == 0) {
            handler.post(new q36((Object) fte, 2, (Object) vt5.a));
        } else {
            handler.post(new ui0(i, 1, fte));
        }
    }

    public agd S(JSONObject jSONObject, w2d w2d) {
        nu7 nu7;
        try {
            jSONObject.optBoolean("markerFound");
            jSONObject.optInt("countBefore");
            jSONObject.optInt("countAfter");
            JSONArray optJSONArray = jSONObject.optJSONArray("participants");
            if (optJSONArray != null) {
                nu7 = ((stf) this.c).G(optJSONArray, w2d);
            } else {
                hw4 hw4 = hw4.a;
                nu7 = new nu7(hw4, hw4);
            }
            return new agd(nu7);
        } catch (JSONException e) {
            ((xwb) this.b).logException("ParticipantListChunkParser", "Can't parse participant chunk", e);
            return null;
        }
    }

    public void T(Object obj, String str) {
        ((ArrayList) this.c).add(str + "=" + obj);
    }

    public void U(c58 c58) {
        v38 v38 = (v38) this.b;
        if ((v38.a.getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, wa7.a(c58, MediaDescriptionCompat.CREATOR));
            v38.a.sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, (ResultReceiver) null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }

    public ay V() {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                String valueOf = String.valueOf(file);
                new StringBuilder(String.valueOf(file2).length() + valueOf.length() + 37);
            }
        }
        try {
            return new ay(file, 0);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf2.length() + 16);
                sb.append("Couldn't create ");
                sb.append(valueOf2);
                throw new IOException(sb.toString(), e);
            }
            try {
                return new ay(file, 0);
            } catch (FileNotFoundException e2) {
                String valueOf3 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(valueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(valueOf3);
                throw new IOException(sb2.toString(), e2);
            }
        }
    }

    public Drawable W(Drawable drawable, boolean z) {
        if (drawable instanceof quf) {
            ((ruf) ((quf) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = W(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: hgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: ls0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: hgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: hgd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.a
            switch(r1) {
                case 3: goto L_0x001a;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r18
            q4e r1 = (defpackage.q4e) r1
            r1.getClass()
            java.lang.Object r0 = r0.c     // Catch:{ ProcessingException -> 0x0019 }
            ez2 r0 = (defpackage.ez2) r0     // Catch:{ ProcessingException -> 0x0019 }
            java.lang.Object r0 = r0.a     // Catch:{ ProcessingException -> 0x0019 }
            r4e r0 = (defpackage.r4e) r0     // Catch:{ ProcessingException -> 0x0019 }
            r0.c(r1)     // Catch:{ ProcessingException -> 0x0019 }
        L_0x0019:
            return
        L_0x001a:
            r1 = r18
            bx6 r1 = (defpackage.bx6) r1
            java.lang.Object r2 = r0.c
            d60 r2 = (defpackage.d60) r2
            boolean r3 = r2.i
            if (r3 == 0) goto L_0x0128
            tx4 r3 = r2.l
            java.lang.Object r0 = r0.b
            tx4 r0 = (defpackage.tx4) r0
            if (r3 == r0) goto L_0x0030
            goto L_0x0128
        L_0x0030:
            boolean r0 = r2.o
            r4 = 0
            r6 = 0
            hgd r7 = r2.e
            ls0 r8 = r2.d
            if (r0 == 0) goto L_0x0069
            long r9 = r2.p
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            r9 = 0
            defpackage.e07.p(r9, r0)
            long r10 = java.lang.System.nanoTime()
            long r12 = r2.p
            long r10 = r10 - r12
            long r12 = r2.f
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0069
            boolean r0 = r2.o
            defpackage.e07.p(r9, r0)
            r8.start()     // Catch:{ AudioStream$AudioStreamException -> 0x0063 }
            r7.stop()     // Catch:{ AudioStream$AudioStreamException -> 0x0063 }
            r2.o = r6     // Catch:{ AudioStream$AudioStreamException -> 0x0063 }
            goto L_0x0069
        L_0x0063:
            long r9 = java.lang.System.nanoTime()
            r2.p = r9
        L_0x0069:
            boolean r0 = r2.o
            if (r0 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r7 = r8
        L_0x006f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            java.lang.String r8 = "The buffer is submitted or canceled."
            if (r0 != 0) goto L_0x0122
            java.nio.ByteBuffer r0 = r1.c
            p80 r7 = r7.read(r0)
            int r9 = r7.a
            if (r9 <= 0) goto L_0x011b
            boolean r10 = r2.r
            if (r10 == 0) goto L_0x00a6
            byte[] r10 = r2.s
            if (r10 == 0) goto L_0x008e
            int r10 = r10.length
            if (r10 >= r9) goto L_0x0092
        L_0x008e:
            byte[] r10 = new byte[r9]
            r2.s = r10
        L_0x0092:
            int r10 = r0.position()
            byte[] r11 = r2.s
            r0.put(r11, r6, r9)
            int r11 = r0.position()
            java.nio.Buffer r11 = r0.limit(r11)
            r11.position(r10)
        L_0x00a6:
            java.util.concurrent.Executor r10 = r2.j
            long r11 = r7.b
            if (r10 == 0) goto L_0x00ef
            long r13 = r2.u
            long r13 = r11 - r13
            r15 = 200(0xc8, double:9.9E-322)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x00ef
            r2.u = r11
            f2b r7 = r2.k
            int r13 = r2.v
            r14 = 2
            if (r13 != r14) goto L_0x00ef
            java.nio.ShortBuffer r13 = r0.asShortBuffer()
            r14 = 0
        L_0x00c5:
            boolean r16 = r13.hasRemaining()
            if (r16 == 0) goto L_0x00db
            short r16 = r13.get()
            int r3 = java.lang.Math.abs(r16)
            double r4 = (double) r3
            double r14 = java.lang.Math.max(r14, r4)
            r4 = 0
            goto L_0x00c5
        L_0x00db:
            r3 = 4674736138332667904(0x40dfffc000000000, double:32767.0)
            double r14 = r14 / r3
            r2.t = r14
            if (r7 == 0) goto L_0x00ef
            c r3 = new c
            r4 = 11
            r3.<init>(r2, r4, r7)
            r10.execute(r3)
        L_0x00ef:
            int r3 = r0.position()
            int r3 = r3 + r9
            r0.limit(r3)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r0.toMicros(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0115
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x010c
            r6 = 1
        L_0x010c:
            defpackage.e07.k(r6)
            r1.g = r3
            r1.b()
            goto L_0x011e
        L_0x0115:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x011b:
            r1.a()
        L_0x011e:
            r2.c()
            goto L_0x012b
        L_0x0122:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0128:
            r1.a()
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.a(java.lang.Object):void");
    }

    public void b() {
        g73 g73 = (g73) this.b;
        try {
            ((of3) ((w63) this.c).c).accept((Object) null);
            g73.b();
        } catch (Throwable th) {
            ek8.a0(th);
            g73.onError(th);
        }
    }

    public ch7 c(Uri uri) {
        Uri uri2;
        ydc ydc = (ydc) this.c;
        if (ydc == null || (uri2 = (Uri) ydc.c) == null || !uri2.equals(uri)) {
            ch7 c2 = ((wm0) this.b).c(uri);
            this.c = new ydc(uri, c2);
            return c2;
        }
        ch7 ch7 = (ch7) ((ydc) this.c).o;
        oyb.l(ch7);
        return ch7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.clear():void");
    }

    public void d(xi4 xi4) {
        ((g73) this.b).d(xi4);
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 3:
                d60 d60 = (d60) this.c;
                if (d60.l == ((tx4) this.b) && !(th instanceof IllegalStateException)) {
                    Executor executor = d60.j;
                    f2b f2b = d60.k;
                    if (executor != null && f2b != null) {
                        executor.execute(new c(f2b, 8, th));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i = ((o4e) this.b).f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    hhd.A(i);
                    return;
                }
                return;
        }
    }

    public void f() {
        Exception exc = new Exception("onDownloadFailed");
        ((hpa) this.b).b((vw) ((l7c) this.c).a, exc);
    }

    public Object get() {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        Object obj2 = ((r3e) this.b).get();
        this.c = obj2;
        return obj2;
    }

    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, ild[] ildArr) {
        String str = ((Context) this.b).getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            return false;
        }
        StringBuilder m = hr1.m("Base apk does not exist: ", str, ". ");
        ((og0) this.c).B(m);
        throw new RuntimeException(m.toString(), unsatisfiedLinkError);
    }

    public boolean isEmpty() {
        return ((f89) ((AtomicReference) this.c).get()) == ((f89) ((AtomicReference) this.b).get());
    }

    public Object k(Uri uri, tz3 tz3) {
        qg5 qg5 = (qg5) ((lja) this.b).k(uri, tz3);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? qg5 : (qg5) qg5.a(list);
    }

    public void l(Task task) {
        boolean h = task.h();
        Continuation continuation = (Continuation) this.c;
        fb6 fb6 = (fb6) this.b;
        if (!h) {
            udd.s(fb6.b, "Fetching FCM registration token failed", task.e());
            continuation.resumeWith((Object) null);
            return;
        }
        Object f = task.f();
        if (f != null) {
            udd.p(fb6.b, "FCM token fetched", new Object[0]);
            continuation.resumeWith((String) f);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public ch7 n(byte[] bArr) {
        byte[] bArr2;
        ydc ydc = (ydc) this.c;
        if (ydc == null || (bArr2 = (byte[]) ydc.b) == null || !Arrays.equals(bArr2, bArr)) {
            ch7 n = ((wm0) this.b).n(bArr);
            this.c = new ydc(bArr, n);
            return n;
        }
        ch7 ch7 = (ch7) ((ydc) this.c).o;
        oyb.l(ch7);
        return ch7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f89, java.lang.Object, java.util.concurrent.atomic.AtomicReference] */
    public boolean offer(Object obj) {
        if (obj != null) {
            ? atomicReference = new AtomicReference();
            atomicReference.a = obj;
            ((f89) ((AtomicReference) this.b).getAndSet(atomicReference)).lazySet(atomicReference);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public void onError(Throwable th) {
        try {
            ((of3) ((w63) this.c).c).accept(th);
        } catch (Throwable th2) {
            ek8.a0(th2);
            th = new CompositeException(th, th2);
        }
        ((g73) this.b).onError(th);
    }

    public void p(String str) {
        File file = new File(str);
        ((hpa) this.b).c((vw) ((l7c) this.c).a, file);
    }

    public Object poll() {
        f89 f89;
        AtomicReference atomicReference = (AtomicReference) this.c;
        f89 f892 = (f89) atomicReference.get();
        f89 f893 = (f89) f892.get();
        if (f893 != null) {
            Object obj = f893.a;
            f893.a = null;
            atomicReference.lazySet(f893);
            return obj;
        } else if (f892 == ((f89) ((AtomicReference) this.b).get())) {
            return null;
        } else {
            do {
                f89 = (f89) f892.get();
            } while (f89 == null);
            Object obj2 = f89.a;
            f89.a = null;
            atomicReference.lazySet(f89);
            return obj2;
        }
    }

    public void r(Object obj, String str) {
        ((ArrayList) this.b).add(me4.i(str, "=", String.valueOf(obj)));
    }

    public void s(lq6 lq6, kq6 kq6, iq6 iq6) {
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        ((ArrayList) this.c).add(kq6);
        if (((HashMap) this.b) == null) {
            this.b = new HashMap();
        }
        ((HashMap) this.b).put(lq6, iq6);
    }

    public void t(c58 c58, int i) {
        v38 v38 = (v38) this.b;
        if ((v38.a.getFlags() & 4) != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, wa7.a(c58, MediaDescriptionCompat.CREATOR));
            bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
            v38.a.sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, (ResultReceiver) null);
            return;
        }
        throw new UnsupportedOperationException("This session doesn't support queue management operations");
    }

    public String toString() {
        switch (this.a) {
            case 25:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 28:
                String str = "[ ";
                if (((nld) this.b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        StringBuilder l = hr1.l(str);
                        l.append(((nld) this.b).w0[i2]);
                        l.append(" ");
                        str = l.toString();
                    }
                }
                StringBuilder n = me4.n(str, "] ");
                n.append((nld) this.b);
                return n.toString();
            default:
                return super.toString();
        }
    }

    public Uri u() {
        if (p0e.Q((String) this.b, ":", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            sb.append('?');
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append('&');
            }
            sb.deleteCharAt(h0e.V(sb));
            return am7.d(sb.toString(), "max", (String) null);
        }
        throw new InvalidDeeplinkNamingException((String) this.b);
    }

    public void w(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.w(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void x(a aVar, boolean z) {
        c cVar = (c) this.b;
        Context context = cVar.w.B0;
        a aVar2 = cVar.y;
        if (aVar2 != null) {
            aVar2.g0().o.x(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void y(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.y(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public void z(a aVar, boolean z) {
        a aVar2 = ((c) this.b).y;
        if (aVar2 != null) {
            aVar2.g0().o.z(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            kx5 kx5 = (kx5) it.next();
            if (!z || kx5.b) {
                kx5.a.getClass();
            }
        }
    }

    public /* synthetic */ mn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ mn(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ mn(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ mn(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ mn(Object obj) {
        this.a = 25;
        a24.o(obj);
        this.c = obj;
        this.b = new ArrayList();
    }

    public mn(a aVar) {
        this.a = 11;
        this.b = new WeakReference(aVar);
        this.c = new WeakReference((Object) null);
    }

    public mn(c cVar) {
        this.a = 17;
        this.b = cVar;
        this.c = new CopyOnWriteArrayList();
    }

    public mn(im imVar) {
        this.a = 11;
        this.c = new WeakReference(imVar);
        this.b = new WeakReference((Object) null);
    }

    public mn(v3b v3b) {
        this.a = 28;
        this.c = v3b;
    }

    public mn(File file) {
        this.a = 2;
        this.b = file;
        this.c = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public mn(Context context, Object obj, LinkedHashSet linkedHashSet) {
        ku1 ku1;
        ibe ibe;
        this.a = 7;
        Object obj2 = new Object();
        this.b = new HashMap();
        this.c = obj2;
        if (obj instanceof ku1) {
            ku1 = (ku1) obj;
        } else {
            xs7.z();
            if (Build.VERSION.SDK_INT >= 30) {
                ibe = new ibe(context, (gp0) null);
            } else {
                ibe = new ibe(context, (gp0) null);
            }
            ku1 = new ku1(ibe);
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.b).put(str, new h4e(context, str, ku1, (oq1) this.c));
        }
    }

    public mn(Context context, uc8 uc8) {
        this.a = 22;
        if (uc8 != null) {
            this.c = Collections.synchronizedSet(new HashSet());
            this.b = new v38(context, uc8);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
