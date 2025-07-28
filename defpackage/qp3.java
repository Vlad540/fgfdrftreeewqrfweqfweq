package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: qp3  reason: default package */
public final class qp3 extends eh0 {
    public final ContentResolver X;
    public Uri Y;
    public AssetFileDescriptor Z;
    public FileInputStream w0;
    public long x0;
    public boolean y0;

    public qp3(Context context) {
        super(false);
        this.X = context.getContentResolver();
    }

    public final long N(xz3 xz3) {
        AssetFileDescriptor assetFileDescriptor;
        xz3 xz32 = xz3;
        int i = 2000;
        try {
            Uri uri = xz32.a;
            this.Y = uri;
            d();
            boolean equals = "content".equals(xz32.a.getScheme());
            ContentResolver contentResolver = this.X;
            if (equals) {
                Bundle bundle = new Bundle();
                if (mze.a >= 31) {
                    pp3.a(bundle);
                }
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.Z = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.w0 = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                long j = xz32.f;
                if (i2 == 0 || j <= length) {
                    long startOffset = assetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.x0 = -1;
                            } else {
                                long position = size - channel.position();
                                this.x0 = position;
                                if (position < 0) {
                                    throw new DataSourceException((Throwable) null, 2008);
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.x0 = j2;
                            if (j2 < 0) {
                                throw new DataSourceException((Throwable) null, 2008);
                            }
                        }
                        long j3 = xz32.g;
                        int i3 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                        if (i3 != 0) {
                            long j4 = this.x0;
                            this.x0 = j4 == -1 ? j3 : Math.min(j4, j3);
                        }
                        this.y0 = true;
                        e(xz3);
                        return i3 != 0 ? j3 : this.x0;
                    }
                    throw new DataSourceException((Throwable) null, 2008);
                }
                throw new DataSourceException((Throwable) null, 2008);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new DataSourceException((Throwable) new IOException(sb.toString()), 2000);
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new DataSourceException((Throwable) e2, i);
        }
    }

    public final void close() {
        this.Y = null;
        try {
            FileInputStream fileInputStream = this.w0;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.w0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.Z;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.Z = null;
                if (this.y0) {
                    this.y0 = false;
                    c();
                }
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            } catch (Throwable th) {
                this.Z = null;
                if (this.y0) {
                    this.y0 = false;
                    c();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, 2000);
        } catch (Throwable th2) {
            this.w0 = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.Z;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.Z = null;
                if (this.y0) {
                    this.y0 = false;
                    c();
                }
                throw th2;
            } catch (IOException e3) {
                throw new DataSourceException((Throwable) e3, 2000);
            } catch (Throwable th3) {
                this.Z = null;
                if (this.y0) {
                    this.y0 = false;
                    c();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.Y;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.x0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            }
        }
        FileInputStream fileInputStream = this.w0;
        int i3 = mze.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.x0;
        if (j2 != -1) {
            this.x0 = j2 - ((long) read);
        }
        b(read);
        return read;
    }
}
