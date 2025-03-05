import { Avatar } from "@mantine/core";
import { IconHeartbeat } from "@tabler/icons-react";
import { Text } from "@mantine/core";
const Sidebar = () => {
  return (
    <div className="bg-red-100 w-64 flex flex-col gap-8 items-center py-7">
      <div className="text-red-500 flex gap-1 items-center ">
        <IconHeartbeat size={40} stroke={2.5} />
        <span className="font-heading text-3xl">Pulse</span>
      </div>
      <div className="flex flex-col gap-1 items-center">
              <div className="rounded-full p-1 bg-white drop-shadow-xl">
        <Avatar
          variant="filled"
          size={"xl"}
          src={
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRw8yHQWQhI-k9gMaRPXv_wXmhJYUYRPqaPBg&s"
          }
        />
      </div>

        <span className="font-medium">Marshal</span>
        <Text c="dimmed" size="xs">Admin</Text>
      </div>

    </div>
  );
};

export default Sidebar;
