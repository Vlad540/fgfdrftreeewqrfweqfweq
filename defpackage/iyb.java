package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: iyb  reason: default package */
public final class iyb extends fh0 {
    public final Context X;
    public yz3 Y;
    public AssetFileDescriptor Z;
    public FileInputStream w0;
    public long x0;
    public boolean y0;

    public iyb(Context context) {
        super(false);
        this.X = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public final long G(yz3 yz3) {
        int i;
        Resources resources;
        Resources resources2;
        int identifier;
        yz3 yz32 = yz3;
        this.Y = yz32;
        d();
        Uri normalizeScheme = yz32.a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.X;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new DataSourceException("Resource identifier must be an integer.", (Throwable) null, 1004);
                }
            } else {
                throw new DataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), (Throwable) null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resources2 = context.getResources();
            } else {
                try {
                    resources2 = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new DataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new DataSourceException("Resource identifier must be an integer.", (Throwable) null, 1004);
                }
            } else {
                identifier = resources2.getIdentifier(me4.i(packageName, ":", path), "raw", (String) null);
                if (identifier == 0) {
                    throw new DataSourceException("Resource not found.", (Throwable) null, 2005);
                }
            }
            i = identifier;
            resources = resources2;
        } else {
            throw new DataSourceException("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", (Throwable) null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd != null) {
                this.Z = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.Z.getFileDescriptor());
                this.w0 = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                long j = yz32.f;
                if (i2 == 0 || j <= length) {
                    long startOffset = this.Z.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.x0 = -1;
                            } else {
                                long size = channel.size() - channel.position();
                                this.x0 = size;
                                if (size < 0) {
                                    throw new DataSourceException((String) null, (Throwable) null, 2008);
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.x0 = j2;
                            if (j2 < 0) {
                                throw new DataSourceException(2008);
                            }
                        }
                        long j3 = yz32.g;
                        int i3 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                        if (i3 != 0) {
                            long j4 = this.x0;
                            this.x0 = j4 == -1 ? j3 : Math.min(j4, j3);
                        }
                        this.y0 = true;
                        e(yz3);
                        return i3 != 0 ? j3 : this.x0;
                    }
                    throw new DataSourceException((String) null, (Throwable) null, 2008);
                }
                try {
                    throw new DataSourceException((String) null, (Throwable) null, 2008);
                } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new DataSourceException((String) null, e3, 2000);
                }
            } else {
                throw new DataSourceException("Resource is compressed: " + normalizeScheme, (Throwable) null, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new DataSourceException((String) null, e4, 2005);
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
                throw new DataSourceException((String) null, e, 2000);
            } catch (Throwable th) {
                this.Z = null;
                if (this.y0) {
                    this.y0 = false;
                    c();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new DataSourceException((String) null, e2, 2000);
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
                throw new DataSourceException((String) null, e3, 2000);
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
        yz3 yz3 = this.Y;
        if (yz3 != null) {
            return yz3.a;
        }
        return null;
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
                throw new DataSourceException((String) null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.w0;
        int i3 = oze.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.x0;
            if (j2 != -1) {
                this.x0 = j2 - ((long) read);
            }
            b(read);
            return read;
        } else if (this.x0 == -1) {
            return -1;
        } else {
            throw new DataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }
}
