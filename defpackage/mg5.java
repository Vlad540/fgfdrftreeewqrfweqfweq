package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.UUID;

/* renamed from: mg5  reason: default package */
public final class mg5 implements bf5 {
    public final wu4 b;
    public final Context c;

    /* JADX WARNING: type inference failed for: r2v1, types: [wu4, java.lang.Object] */
    public mg5(Context context) {
        this.c = context;
        ? obj = new Object();
        obj.a = "ru.oneme.app.provider";
        this.b = obj;
    }

    public static File g(String str, String str2) {
        File file = new File(str, str2);
        file.mkdirs();
        return file;
    }

    public static Uri r(String str) {
        if (r1g.p(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public final String b() {
        File externalCacheDir;
        if (Build.VERSION.SDK_INT <= 29 || (externalCacheDir = this.c.getExternalCacheDir()) == null) {
            return c();
        }
        File file = new File(externalCacheDir.getAbsolutePath());
        if (!file.exists() && !file.mkdirs()) {
            udd.T("mg5", "getAppBasePath: mkdirs fails!", new Object[0]);
        }
        return file.getAbsolutePath();
    }

    public final String c() {
        File file = new File(this.c.getCacheDir().getAbsolutePath());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public final File d(long j) {
        return new File(g(b(), "audioCache"), us8.j(j, "audio_", ".wav"));
    }

    public final File e(long j) {
        return new File(g(b(), "botCommands"), us8.i(j, "botCommands"));
    }

    public final Uri f(Context context, File file) {
        return FileProvider.d(context, file, this.b.a);
    }

    public final File h(o10 o10) {
        File file;
        boolean p = r1g.p(o10.r);
        long j = o10.v;
        v00 v00 = o10.j;
        if (!p) {
            File file2 = new File(o10.r);
            if (file2.exists() && file2.length() == v00.b && file2.lastModified() == j) {
                return file2;
            }
        }
        long j2 = v00.a;
        String e = js.e(v00.c);
        String e2 = js.e(e);
        File j3 = j();
        int lastIndexOf = e2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String substring = e2.substring(0, lastIndexOf);
            String substring2 = e2.substring(lastIndexOf);
            file = new File(j3, substring + "_" + j2 + substring2);
        } else {
            file = new File(j3, e2 + "_" + j2);
        }
        if (file.exists()) {
            return file;
        }
        File file3 = new File(j(), e);
        return (file3.exists() && file3.length() == v00.b && file3.lastModified() == j) ? file3 : lp.r(j(), js.e(e));
    }

    public final File i(String str) {
        return new File(j(), js.e(str));
    }

    public final File j() {
        String str = Environment.DIRECTORY_DOWNLOADS;
        File externalFilesDir = Build.VERSION.SDK_INT == 29 ? this.c.getExternalFilesDir(str) : Environment.getExternalStoragePublicDirectory(str);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath(), "MAX");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final File k(long j) {
        return new File(g(b(), "gifCache"), us8.i(j, "gif_"));
    }

    public final File l(String str) {
        return new File(m(), rf0.h("gif_preview", str));
    }

    public final File m() {
        return g(b(), "imageCache");
    }

    public final File n(String str) {
        return q(str + ".mp4");
    }

    public final File o(String str, String str2) {
        String h = !r1g.p(str2) ? rf0.h(".", str2) : "";
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        return q(str + h);
    }

    public final File p() {
        File file = new File(b(), "showcase");
        if (file.exists() && file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    public final File q(String str) {
        return new File(g(b(), "upload"), js.e(str));
    }

    public final File s(long j) {
        return new File(j(), us8.j(j, "video_", ".mp4"));
    }
}
