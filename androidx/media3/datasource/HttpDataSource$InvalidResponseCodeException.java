package androidx.media3.datasource;

import java.io.IOException;
import java.util.Map;

public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map X;
    public final int o;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
        super(wn6.h(i, "Response code: "), (IOException) dataSourceException, 2004);
        this.o = i;
        this.X = map;
    }
}
