package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: md5  reason: default package */
public final class md5 extends fh0 {
    public RandomAccessFile X;
    public Uri Y;
    public long Z;
    public boolean w0;

    public final long G(yz3 yz3) {
        Uri uri = yz3.a;
        long j = yz3.f;
        this.Y = uri;
        d();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.X = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = yz3.g;
                if (j2 == -1) {
                    j2 = this.X.length() - j;
                }
                this.Z = j2;
                if (j2 >= 0) {
                    this.w0 = true;
                    e(yz3);
                    return this.Z;
                }
                throw new DataSourceException((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                String path2 = uri.getPath();
                String query = uri.getQuery();
                String fragment = uri.getFragment();
                StringBuilder j3 = c3d.j("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
                j3.append(fragment);
                throw new DataSourceException(j3.toString(), e2, 1004);
            }
            if (oze.a < 21 || !id5.b(e2.getCause())) {
                i = 2005;
            }
            throw new DataSourceException((Throwable) e2, i);
        } catch (SecurityException e3) {
            throw new DataSourceException((Throwable) e3, 2006);
        } catch (RuntimeException e4) {
            throw new DataSourceException((Throwable) e4, 2000);
        }
    }

    public final void close() {
        this.Y = null;
        try {
            RandomAccessFile randomAccessFile = this.X;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.X = null;
            if (this.w0) {
                this.w0 = false;
                c();
            }
        } catch (IOException e) {
            throw new DataSourceException((Throwable) e, 2000);
        } catch (Throwable th) {
            this.X = null;
            if (this.w0) {
                this.w0 = false;
                c();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.Y;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.Z;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.X;
            int i3 = oze.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.Z -= (long) read;
                b(read);
            }
            return read;
        } catch (IOException e) {
            throw new DataSourceException((Throwable) e, 2000);
        }
    }
}
