package ru.ok.messages;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/NotificationsImagesProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationsImagesProvider extends ContentProvider {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("one.me.android.notifications", "message_image/*/*", 1);
        a = uriMatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(ru.ok.messages.NotificationsImagesProvider r7, ov0 r8, ou3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.yp9
            if (r0 == 0) goto L_0x0016
            r0 = r10
            yp9 r0 = (defpackage.yp9) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x001b
        L_0x0016:
            yp9 r0 = new yp9
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            ou3 r7 = r0.Y
            ov0 r8 = r0.X
            ru.ok.messages.NotificationsImagesProvider r9 = r0.o
            wx3.H(r10)
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x003e
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            wx3.H(r10)
        L_0x003e:
            boolean r10 = n1g.A(r9)
            if (r10 == 0) goto L_0x0066
            r7.getClass()
            java.io.File r10 = b(r8)
            if (r10 == 0) goto L_0x0055
            boolean r2 = r10.exists()
            if (r2 == 0) goto L_0x0055
            r1 = r10
            goto L_0x0067
        L_0x0055:
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.x0 = r3
            r4 = 100
            java.lang.Object r10 = defpackage.ek8.q(r4, r0)
            if (r10 != r1) goto L_0x003e
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.NotificationsImagesProvider.a(ru.ok.messages.NotificationsImagesProvider, ov0, ou3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static File b(ov0 ov0) {
        bd5 c = ((cd5) ((zh4) ir6.g().d.get()).a.getValue()).c(ov0);
        if (!(c instanceof bd5)) {
            c = null;
        }
        if (c != null) {
            return c.a;
        }
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        if (p0e.Q(str, "*/", false) || p0e.Q(str, "image/", false)) {
            return new String[]{"image/jpeg", "image/png", "image/webp"};
        }
        return null;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        List<String> pathSegments;
        File file;
        if (!"r".equals(str)) {
            throw new SecurityException("Only read mode is supported");
        } else if (a.match(uri) != 1 || (pathSegments = uri.getPathSegments()) == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("Wrong uri");
        } else {
            List<String> pathSegments2 = uri.getPathSegments();
            String str2 = pathSegments2.get(1);
            if (str2 == null) {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                throw new FileNotFoundException("Failed");
            }
            String str3 = pathSegments2.get(2);
            if (str3 != null) {
                boolean parseBoolean = Boolean.parseBoolean(str3);
                Uri x = at7.x(str2);
                if (!js.y(x, getContext(), vl.b().g())) {
                    ur6 d = ur6.d(x);
                    d.b = sr6.c;
                    tr6 a2 = d.a();
                    m54 p = m54.p();
                    p.getClass();
                    ngd o = p.o(a2.b);
                    File b = b(o);
                    if (!lp.n(b) && parseBoolean) {
                        try {
                            file = (File) xs7.M(bw4.a, new aq9(this, x, o, (Continuation) null));
                        } catch (Throwable th) {
                            file = new kcc(th);
                        }
                        Throwable a3 = mcc.a(file);
                        if (a3 == null) {
                            b = file;
                        } else {
                            udd.s("ru.ok.messages.NotificationsImagesProvider", "fetchUriOnDiskSync: failed", a3);
                            throw new FileNotFoundException("Download failed");
                        }
                    }
                    if (b != null) {
                        return ParcelFileDescriptor.open(b, 268435456);
                    }
                    udd.q("ru.ok.messages.NotificationsImagesProvider", "openFile: no image in cache, loadFromNetwork=" + parseBoolean);
                    throw new FileNotFoundException("Failed");
                }
                udd.s("ru.ok.messages.NotificationsImagesProvider", "openFile: failed, internal uri=" + uri, (Throwable) null);
                throw new SecurityException("Internal uri detected");
            }
            throw new FileNotFoundException("Failed");
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
