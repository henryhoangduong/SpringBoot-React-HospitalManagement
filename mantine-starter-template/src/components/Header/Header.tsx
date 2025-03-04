import { ActionIcon } from "@mantine/core";
import {
  IconLayoutSidebarLeftCollapseFilled,
} from "@tabler/icons-react";
import ProfileMenu from "./ProfileMenu";

const Header = () => {
  return (
    <div className="bg-cyan-100 w-full h-16 flex justify-between px-5">
      <ActionIcon variant="transparent" aria-label="Settings">
        <IconLayoutSidebarLeftCollapseFilled
          size={"lg"}
          style={{ width: "70%", height: "70%" }}
          stroke={1.5}
        />
          </ActionIcon>
          <ProfileMenu/>
    </div>
  );
};

export default Header;
