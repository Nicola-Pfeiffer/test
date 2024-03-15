# Launch instructions

1. Unzip `openjfx-21.0.1_windows-x64_bin-sdk` located in `$USER\Desktop`
2. Make sure the project is located in `$USER\IdeaProjects`
3. Launch the `app.bat` file located in `$USER\Desktop`

### If this doesn't work

1. Open IntelliJ Idea
2. Launch the jar file located in `~\out\artifacts\<name>_jar`
3. Right click on the file and select `Run <name>.jar`
   - This will likely give you an error
4. Click on the 3 dots on the top right and select `Edit`
5. In `VM options` enter the following: `--module-path C:\Users\regio\Desktop\openjfx-21.0.1_windows-x64_bin-sdk\javafx-sdk-21.0.1\lib --add-modules=javafx.controls,javafx.fxml`
6. Click `Apply` and select `Run`
