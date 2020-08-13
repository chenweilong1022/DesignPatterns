package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:25
 */
public interface Command {

    void execute();

    void undo();
}
