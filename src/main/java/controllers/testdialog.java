package controllers;

import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * @author StarsEnd
 * @since 2021-03-20
 */
public class testdialog {
	@FXML
	private AnchorPane context;

	@FXML
	private JFXDialog dialog;

	private StackPane dialogStackPane;

	/**
	 * 弹出JFXDialog弹窗
	 */
	public void alert() {
		addDialogStackPane();
		dialog.setTransitionType(JFXDialog.DialogTransition.CENTER);
		dialog.show(dialogStackPane);
	}

	/**
	 * 关闭JFXDialog弹窗
	 */
	public void close() {
		dialog.close();
		dialogStackPane.getChildren().remove(dialog);
		context.getChildren().remove(dialogStackPane);
	}

	/**
	 * 新增JFXDialog弹窗容器
	 */
	private void addDialogStackPane() {
		dialogStackPane = new StackPane();
		dialogStackPane.setPrefHeight(context.getHeight());
		dialogStackPane.setPrefWidth(context.getWidth());
		context.getChildren().add(dialogStackPane);
	}
}