package com.joypupil.study.tools.压缩和解压;

import java.io.Closeable;
import java.io.IOException;

public class IOUtil {

	/**
     * @description 关闭流
     * @param closeable
     */
    public static void closeQuietly(Closeable closeable)
    {
        try
        {
            if (null != closeable)
            {
                closeable.close();
            }
        }
        catch (IOException e)
        {
            // ignore
        }
    }
}
